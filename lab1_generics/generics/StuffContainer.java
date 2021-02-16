//Object superclass to do generics

public class StuffContainer {


    private final int DEFAULT_CAP = 10;
    Object[] stuff;
    int pos;


    public StuffContainer() {

        stuff = new Object[DEFAULT_CAP];
        pos = 0;

    }


    public void addShape(Object s) {

        if(pos >= stuff.length) {
            expandContainer();
        }
        stuff[pos] = s;
        pos++;

    }


    public Object removeShape(Object s) {

        Object tmp = null;
        for(int i = 0; i < stuff.length; i++) {
            if(stuff[i] == s) {
                tmp = stuff[i];
                stuff[i] = null;
                for(int j = i; j < pos; j++) {
                    stuff[j] = stuff[j+1];
                    j++;
                }
                pos--;
                stuff[pos] = null;
                break;
            }
        }

        return tmp;

    }


    public void expandContainer() {

        Object[] tmp = new Object[stuff.length * 2];
        for(int i = 0; i < stuff.length; i++) {
            tmp[i] = stuff[i];
            i++;
        }
        stuff = tmp;

    }


    //search stuff either by color (String) or area (int)
    public Object search(Object s) {

        for(Object tmp : stuff) {
            if(s == tmp) {
                return tmp;
            }
        }

        return null;

    }


    public String toString() {

        String s = "";
        for(int i = 0; i < stuff.length && stuff[i] != null; i++) {
            if(i == stuff.length-1) {
                s += stuff[i];
            } else {
                s += stuff[i] + " | ";
            }
        }

        return s;

    }

    
}
