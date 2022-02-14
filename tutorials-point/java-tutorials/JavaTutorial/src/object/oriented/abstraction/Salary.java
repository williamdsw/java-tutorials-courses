package object.oriented.abstraction;

/**
 * @author William
 */
public class Salary extends Employee {

    private Double salary;

    public Salary() {
    }

    public Salary(String name, String address, Integer number, Double salary) {
        super(name, address, number);
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double newSalary) {
        if (newSalary >= 0) {
            this.salary = newSalary;
        }
    }

    @Override
    public void mailCheck() {
        System.out.printf("Mailing check to %s with salary %f \n", this.getName(), this.getSalary());
    }

    @Override
    public double computePay() {
        System.out.printf("Computing salary pay for %s \n", this.getName());
        return salary / 52;
    }
}