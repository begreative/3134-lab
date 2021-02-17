class Personnel implements Comparable<Personnel>{
    
    private String id;
    
    private int rank;
    private boolean deploymentStatus;
    
    public Personnel(String id, int rank){
        this.id = id;
        this.rank = rank;
        this.deploymentStatus = false;
    }

    public void deploy(){
        deploymentStatus = true;
    }

    public void undeploy(){
        deploymentStatus = false;
    }

    public int getRank(){
        return rank;
    }

    public String getID(){
        return id;
    }

    public int compareTo(Personnel other){
        return id.compareTo(other.getID());
    }

}