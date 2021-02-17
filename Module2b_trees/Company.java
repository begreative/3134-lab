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
            return getLevelRecurse(id, head.left);
        }else{
            return getLevelRecurse(id, head.right);
        }  

    }

    public static void hire(Employee newEmployee, double startingSalary){
        hireRecurse(newEmployee, startingSalary, founder);
    }

    private static void hireRecurse(Employee newEmployee, double startingSalary, Node head){
        
        Node newnode = new Node(newEmployee); 
        
        if (head == null){
            head = newnode;
            head.myEmployee.updateSalary(startingSalary); 
        }else if(newnode.myEmployee.compareTo(head.myEmployee) < 0)
            hireRecurse(newEmployee, startingSalary, head.left);
        else if(newnode.myEmployee.compareTo(head.myEmployee) > 0)
            hireRecurse(newEmployee, startingSalary, head.right);
        else
            System.out.println("Error: duplicate employee");
        
    }

    //Extra method for extra time: practice delete by firing someone
    //public static void fire(Employee toFire){}

    //Extra method for extra time: find people by rank 
    //SHOULD BE PRIORITIZED TO LEAD INTO HEAPS FOR THE NEXT WEEK
    //public static Employee[] findByRank(int rank){}

    //Add something like mirror()
      
}