import java.util.*;

class Company{

    /* Unless otherwise specified, all of this file should be written by students.
    * All method signatures will be provided, to guide students on the right track.
    * Students will also be asked to create their own test file to test whether their methods work.
    */ 
    
    //Node class will be given
    private static class Node{
        
        public Employee myEmployee;
        
        public Node left;
        public Node right;
        
        public Node(Employee m){
            myEmployee = m;
        }
    }

    //Instance variable will be given
    private static Node founder;

    //Constructor will be given
    public Company(Employee founder){
        this.founder = new Node(founder);
    }
    
    public static int getLevel(String id){
        return getLevelRecurse(id, founder);
    }

    private static int getLevelRecurse(String id, Node head){

        if(head == null){
            System.out.println("Employee not found.");
            return -1;
        }else if(head.myEmployee.getID().equals(id)){
            return head.myEmployee.getLevel();
        }else if(head.myEmployee.getID().compareTo(id)<0){
            return getLevelRecurse(id, head.right);
        }else{
            return getLevelRecurse(id, head.left);
        }  

    }

    public static void hire(Employee newEmployee, double startingSalary){
        Node newNode = hireRecurse(newEmployee, startingSalary, founder);
        System.out.println("Added: "+ newNode.myEmployee);
    }

    private static Node hireRecurse(Employee newEmployee, double startingSalary, Node head){
        
        Node newnode = new Node(newEmployee); 
        
        if(head == null){
            head = newnode;
            head.myEmployee.updateSalary(startingSalary); 
            return head;
        }else if(newnode.myEmployee.compareTo(head.myEmployee) < 0)
            head.left = hireRecurse(newEmployee, startingSalary, head.left);
        else if(newnode.myEmployee.compareTo(head.myEmployee) > 0)
            head.right = hireRecurse(newEmployee, startingSalary, head.right);
        else{
            System.out.println("Error: duplicate employee");
        }
        
        return head;
        
    }

    /*
    Find people by their given level.
    This will require doing a full traversal -- try doing it breadth first, to help with the homework.
    This will also provide motivation to talk about heaps
    */
    
    public static List<Employee> findByLevel(int level){
        //do breadth first - like pretty print
        List<Employee> atLevel = new LinkedList<>(); //Question: should we use LinkedList or ArrayList?
        LinkedList<Node> myQ = new LinkedList<Node>();
        myQ.addLast(founder);
        while(!myQ.isEmpty()){
            
            Node tmp = myQ.removeFirst();
            
            if(tmp.left!=null){
                myQ.addLast(tmp.left);
            }
            if(tmp.right!=null){
                myQ.addLast(tmp.right);
            }

            if(tmp.myEmployee.getLevel()==level){
                atLevel.add(0,tmp.myEmployee);
            }
        }
        return atLevel;
    }

    /* Methods below will be provided to help with testing */

    public static void print(){
        printR(founder);
    }

    public static void printR(Node head){
        if(head==null){
            return;
        }else{
            System.out.println(head.myEmployee);
            System.out.println("Left:");
            printR(head.left);
            System.out.println("Right:");
            printR(head.right);
        }
    }
    
      
}