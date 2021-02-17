class Employee implements Comparable<Employee>{
    
    private String employee_id;
    
    private int level;
    private double salary;
    
    public Employee(String id, int lev){
        employee_id = id;
        level = lev;
    }
    
    public String toString(){
        return "ID: " + employee_id + "; Level: " + level;
    }

    public void updateSalary(double sal){
        salary = sal;
    }

    public String getID(){
        return employee_id;
    }

    public int getLevel(){
        return level;
    }

    public int compareTo(Employee other){
        return employee_id.compareTo(other.getID());
    }

}