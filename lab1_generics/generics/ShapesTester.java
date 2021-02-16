//Object superclass to do generics

public class ShapesTester {

    public static void main(String[] args) {
        
        Square sq = new Square("blue", 2);
        // Triangle tr = new Triangle("green", 3, 4, 5);
        // Circle cir = new Circle("red", 3);
        
        StuffContainer squares = new StuffContainer();
        squares.addShape(sq);
        // box.addShape(tr);
        // box.addShape(cir);

        System.out.println(squares);

        squares.removeShape(sq);

        System.out.println(squares + "hi");
        
        
    }

    
}
