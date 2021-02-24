import java.util.*;

class MilitaryTester{
    public final static void main(String[] args){
        Military mill = new Military(new Personnel("sm2245", 1));
        mill.enlist((new Personnel("er7890", 18)), true);
        mill.enlist((new Personnel("al5678", 18)), false);
        mill.enlist((new Personnel("jc5671", 3)), true);
        mill.enlist((new Personnel("ds4318", 12)), true);
        
        mill.print();            
        mill.deploy("al5678");
        mill.print();
        
        
        
    }
   
}