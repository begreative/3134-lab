//Object superclass to do generics

public class ShapesTester {

    public static void main(String[] args) {
        
        Square sq = new Square("blue", 2);
        Circle cir = new Circle("red", 3);
        
        StuffContainer box = new StuffContainer();
        box.addStuff(sq);
        box.addStuff(cir);

        System.out.println(box);

        box.removeStuff(sq);

        System.out.println(box);
        
        
    }

    
}
