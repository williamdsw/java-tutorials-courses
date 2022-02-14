package object.oriented.abstraction;

/**
 * @author William
 */
public abstract class Employee {
    private String name;
    private String address;
    private Integer number;

    public Employee() {
    }

    public Employee(String name, String address, Integer number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", this.getName(), this.getAddress(), this.getNumber());
    }

    public void mailCheck() {
        System.out.printf("Mailing a check to %s of %s \n", this.getName(), this.getAddress());
    }

    public abstract double computePay();
}