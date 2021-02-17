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
            deployRecurse(id, head.left);
        }else{
            deployRecurse(id, head.right);
        }  

    }

    public static void enlist(Personnel newPersonnel, boolean deploymentStatus){
        enlistRecurse(newPersonnel, deploymentStatus, commanderInChief);
    }

    private static void enlistRecurse(Personnel newPersonnel, boolean deploymentStatus, Node head){
        
        Node newnode = new Node(newPersonnel); 
        if (head == null){
            head = newnode;
            if(deploymentStatus)
                head.myPersonnel.deploy(); 
            else
                head.myPersonnel.undeploy(); 
        }else if(newnode.myPersonnel.compareTo(head.myPersonnel) < 0)
            enlistRecurse(newPersonnel, deploymentStatus, head.left);
        else if(newnode.myPersonnel.compareTo(head.myPersonnel) > 0)
            enlistRecurse(newPersonnel, deploymentStatus, head.right);
        else
            System.out.println("Error: duplicate personnel");
        
    }

}