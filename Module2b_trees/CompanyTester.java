/* File to be written by the students, 
 * to give them practice writing testers.
 */

import java.util.*;

class CompanyTester{
    public final static void main(String[] args){
        Company apple = new Company(new Employee("Steve_Jobs", 1));
        apple.hire(new Employee("Tim_Cook", 2), 5000000);
        apple.hire(new Employee("Paul_Blaer", 2), 1000000);
        apple.hire(new Employee("Emily_Ringel", 5), 50000);
        apple.hire(new Employee("Sophie_Reese-Wirpsa", 5), 50000);
        //QUESTION: what does this tree actually look like?

        apple.print();

        System.out.println("Prof Blaer's Level: " + apple.getLevel("Paul_Blaer"));
        System.out.println("Emily's Level: " + apple.getLevel("Emily_Ringel"));

        List<Employee> level2 = apple.findByLevel(2);
        System.out.println("Level 2:");
        for(Employee emp: level2){
            System.out.println(emp);
        }
    }
}