package data.structure;

/**
 * @author William
 */

// DATA STRUCTURES
public class QueueDemo {
    public static void main(String[] args) {
        // Data
        Queue<Employee> employees = new Queue<>();
        employees.enqueue(new Employee("Michael", "Schenker"));
        employees.enqueue(new Employee("Ritchie", "Blackmore"));
        employees.enqueue(new Employee("Yngwie", "Malmsteen"));

        // Output
        System.out.println("Employees:");
        while (employees.hasItems()) {
            Employee employee = employees.dequeue();
            System.out.println(employee.toString());
        }
    }
}