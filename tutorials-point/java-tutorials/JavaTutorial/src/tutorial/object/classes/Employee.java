package tutorial.object.classes;

/**
 * @author William
 */
public class Employee
{
    //------------------------------------------------------------------------//
    // FIELDS
    
    private String name;
    private int age;
    private String designation;
    private double salary;
    
    //------------------------------------------------------------------------//
    // CONSTRUTOR
    
    public Employee (String name)
    {
        this.name = name;
    }

    //------------------------------------------------------------------------//
    // SETTERS
    
    public void setAge (int age)
    {
        this.age = age;
    }

    public void setDesignation (String designation)
    {
        this.designation = designation;
    }

    public void setSalary (double salary)
    {
        this.salary = salary;
    }
    
    //------------------------------------------------------------------------//
    // HELPER FUNCTIONS
    
    public void printEmployee ()
    {
        System.out.println ("Name: " + name);
        System.out.println ("age: " + age);
        System.out.println ("designation: " + designation);
        System.out.println ("salary: " + salary);
    }
}