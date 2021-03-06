//Interfaces to do minimal generics

public class Square implements Shape {


    private String type;
    private String color;
    private int sides;
    private int area; //cm


    public Square(String c, int s) {            
        type = "Square";
        color = c;
        sides = s;
        setArea();
    }


    public int getArea() { return area; }


    public String getColor() { return color; }
    

    private void setArea() { area = sides * sides; }

    
    @Override
    public String toString() {

        return type + ": " + color + ", " + area;

    }


}