class Employee implements Comparable<Employee>{
    
    private String employeeID;
    
    private int level;
    private double salary;
    
    public Employee(String id, int lev){
        employeeID = id;
        level = lev;
    }
    
    public String toString(){
        return "ID: " + employeeID + "; Level: " + level;
    }

    public void updateSalary(double sal){
        salary = sal;
    }

    public String getID(){
        return employeeID;
    }

    public int getLevel(){
        return level;
    }

    public int compareTo(Employee other){
        return employeeID.compareTo(other.getID());
    }

}