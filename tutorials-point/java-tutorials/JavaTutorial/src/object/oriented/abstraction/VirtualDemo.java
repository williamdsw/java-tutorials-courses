package object.oriented.abstraction;

import object.oriented.abstraction.Employee;
import object.oriented.abstraction.Salary;

/**
 * @author William
 */
public class VirtualDemo {
    public static void main(String[] args) {
        Salary salary = new Salary("James Hetfield", "California", 1, 2000.99);
        Employee employee = new Salary("Dave Mustaine", "San Diego", 2, 5000.88);

        // Output
        System.out.println("Salary's mailCheck:");
        salary.mailCheck();
        System.out.println("Employee's mailCheck:");
        employee.mailCheck();
    }
}