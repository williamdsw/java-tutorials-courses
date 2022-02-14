package tutorial.object.classes;

/**
 * @author William
 */
public class EmployeeTest
{
    public static void main (String[] args)
    {
        // Objects
        Employee empOne = new Employee ("James Hetfield");
        Employee empTwo = new Employee ("Dave Mustaine");
        
        // Data
        empOne.setAge (55);
        empOne.setDesignation ("Songwriter");
        empOne.setSalary (2000.0);
        empOne.printEmployee ();
        
        empTwo.setAge (60);
        empTwo.setDesignation ("Lead Guitar");
        empTwo.setSalary (3500.99);
        empTwo.printEmployee ();
    }
}
