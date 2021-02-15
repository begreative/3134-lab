public class ShapesTester {

    public static void main(String[] args) {
        
        Square sq = new Square("blue", 2);
        Triangle tr = new Triangle("green", 3, 4, 5);
        Circle cir = new Circle("red", 3);
        
        ShapesContainer box = new ShapesContainer();
        box.addShape(sq);
        box.addShape(tr);
        box.addShape(cir);

        System.out.println(box);
        
    }

    
}
