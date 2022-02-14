package classes;

/**
 * @author William
 */
public class Human implements Animal {

    private String firstName;
    private String lastName;
    private String species;
    private Integer age;
    private Double height;
    private Double weight;

    public Human() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String getSpecies() {
        return species;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public Double getHeight() {
        return height;
    }

    @Override
    public Double getWeight() {
        return weight;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public void setFirstName(String value) {
        this.firstName = value;
    }

    public void setLastName(String value) {
        this.lastName = value;
    }

    @Override
    public void setSpecies(String value) {
        this.species = value;
    }

    @Override
    public void setAge(Integer value) {
        this.age = value;
    }

    @Override
    public void setHeight(Double value) {
        this.height = value;
    }

    @Override
    public void setWeight(Double value) {
        this.weight = value;
    }
}