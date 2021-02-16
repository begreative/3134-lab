//Real generics

public class Circle {


    private String type;
    private String color;
    private int diameter;
    private int area; //cm


    public Circle(String c, int d) {            
        type = "Circle";
        color = c;
        diameter = d;
        setArea();
    }


    public int getArea() { return area; }


    public String getColor() { return color; }
    

    private void setArea() {

        int radius = diameter/2;
        area = (int) Math.PI * (radius * radius);

    }

    
    @Override
    public String toString() {

        return type + ": " + color + ", " + area;

    }


}