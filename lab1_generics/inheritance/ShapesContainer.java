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


    public void removeShape(Shape s) {


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
    public Shape search(Shape o) {

        return o;

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
