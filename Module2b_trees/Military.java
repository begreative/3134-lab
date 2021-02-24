class Military{

    private static class Node{
        
        public Personnel myPersonnel;
        
        public Node left;
        public Node right;
        
        public Node(Personnel m){
            myPersonnel = m;
        }
        
    }

    //Instance variable will be given
    private static Node commanderInChief;

    //Constructor will be given
    public Military(Personnel president){
        this.commanderInChief = new Node(president);
    }
    
    public static void deploy(String id){
        deployRecurse(id, commanderInChief);
    }

    private static void deployRecurse(String id, Node head){
        
        if(head == null){
            System.out.println("Not found.");
        }else if(head.myPersonnel.getID().equals(id)){
            head.myPersonnel.deploy();
        }else if(head.myPersonnel.getID().compareTo(id)<0){
            deployRecurse(id, head.right);
        }else{
            deployRecurse(id, head.left);
        }  

    }

    public static void enlist(Personnel newPersonnel, boolean deploymentStatus){
        enlistRecurse(newPersonnel, deploymentStatus, commanderInChief);
    }

    private static Node enlistRecurse(Personnel newPersonnel, boolean deploymentStatus, Node head){
        
        Node newnode = new Node(newPersonnel); 
        if (head == null){
            head = newnode;
            if(deploymentStatus)
                head.myPersonnel.deploy(); 
            else
                head.myPersonnel.undeploy(); 
            return head;
        }else if(newnode.myPersonnel.compareTo(head.myPersonnel) < 0)
            head.left = enlistRecurse(newPersonnel, deploymentStatus, head.left);
        else if(newnode.myPersonnel.compareTo(head.myPersonnel) > 0)
            head.right = enlistRecurse(newPersonnel, deploymentStatus, head.right);
        else
            System.out.println("Error: duplicate personnel");
        
        return head;
    }
    
    
    public static void print(){
        printR(commanderInChief);
    }

    public static void printR(Node head){
        if(head==null){
            return;
        }else{
            System.out.println(head.myPersonnel);
            System.out.println("Left:");
            printR(head.left);
            System.out.println("Right:");
            printR(head.right);
        }
    }

}