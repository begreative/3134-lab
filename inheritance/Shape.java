//Inheritance

public class Shape implements Comparable<Shape> {


    protected String type;
    private String color;
    protected int area; //cm


    public Shape(String c) {

        type = "None";
        color = c.toLowerCase();

    }


    public int getArea() { return area; }


    public String getColor() { return color; }


    @Override
    public String toString() {

        return type + ": " + color + ", " + area;

    }


    public int compareTo(Shape o) {

        return this.area - o.area;

    }


}


class Square extends Shape {

    private int sides;

    public Square(String c, int s) {            
        super(c);
        type = "Square";
        sides = s;
        setArea();
    }

    private void setArea() { area = sides * sides; }

}


class Circle extends Shape {

    private int diameter;

    public Circle(String c, int d) {

        super(c);
        type = "Circle";
        diameter = d;
        setArea();

    }

    private void setArea() {

        int radius = diameter/2;
        area = (int) Math.PI * (radius * radius);

    }
    
}


class Triangle extends Shape {

    private int sideA, sideB, sideC;

    public Triangle(String c, int a, int b, int c2) {

        super(c);
        type = "Triangle";
        sideA = a;
        sideB = b;
        sideC = c2;
        setArea();

    }

    private void setArea() {

        int s = (sideA + sideB + sideC)/2;
        area = (int) Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));

    }

}