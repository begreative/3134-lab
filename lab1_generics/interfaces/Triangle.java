//Interfaces to do minimal generics 

public class Triangle implements Shape {


    private String type;
    private String color;
    private int sideA, sideB, sideC;
    private int area; //cm


    public Triangle(String c, int a, int b, int c2) {            
        type = "Triangle";
        color = c;
        sideA = a;
        sideB = b;
        sideC = c2;
        setArea();
    }


    public int getArea() { return area; }


    public String getColor() { return color; }
    

    private void setArea() {

        int s = (sideA + sideB + sideC)/2;
        area = (int) Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));

    }

    
    @Override
    public String toString() {

        return type + ": " + color + ", " + area;

    }


}