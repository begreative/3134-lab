//Real generics

import java.util.ArrayList;

public class StuffContainer<Whatever> {


    ArrayList<Whatever> stuff;


    public StuffContainer() {

        stuff = new ArrayList<>();

    }


    public void addStuff(Whatever s) {

        stuff.add(s);

    }


    public void removeStuff(Whatever s) {

        stuff.remove(s);

    }


    //should we add a search here???


    public String toString() {

        String s = "";
        for(int i = 0; i < stuff.size() && stuff.get(i) != null; i++) {
            if(i == stuff.size()-1) {
                s += stuff.get(i);
            } else {
                s += stuff.get(i) + " | ";
            }
        }

        return s;

    }

    
}
