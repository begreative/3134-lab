//Inheritance to do minimal generics

public class ShapesContainer {


    private final int DEFAULT_CAP = 10;
    Shape[] shapes;
    int pos;


    public ShapesContainer() {

        shapes = new Shape[DEFAULT_CAP];
        pos = 0;

    }


    public void addShape(Shape s) {

        if(pos >= shapes.length) {
            expandContainer();
        }
        shapes[pos] = s;
        pos++;

    }


    public Shape removeShape(Shape s) {

        Shape tmp = null;
        for(int i = 0; i < shapes.length; i++) {
            if(shapes[i] == s) {
                tmp = shapes[i];
                shapes[i] = null;
                for(int j = i; j < pos; j++) {
                    shapes[j] = shapes[j+1];
                    j++;
                }
                pos--;
                shapes[pos] = null;
                break;
            }
        }

        return tmp;

    }


    public void expandContainer() {

        Shape[] tmp = new Shape[shapes.length * 2];
        for(int i = 0; i < shapes.length; i++) {
            tmp[i] = shapes[i];
            i++;
        }
        shapes = tmp;

    }


    //search shapes either by color (String) or area (int)
    public Shape search(Shape s) {

        for(Shape tmp : shapes) {
            if(s == tmp) {
                return tmp;
            }
        }

        return null;

    }


    public String toString() {

        String s = "";
        for(int i = 0; i < shapes.length && shapes[i] != null; i++) {
            if(i == shapes.length-1) {
                s += shapes[i];
            } else {
                s += shapes[i] + " | ";
            }
        }

        return s;

    }

    
}
