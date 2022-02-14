package classes;

/**
 * @author William
 */
public interface Animal {

    public String getSpecies();

    public Integer getAge();

    public Double getHeight();

    public Double getWeight();

    public void setSpecies(String value);

    public void setAge(Integer value);

    public void setHeight(Double value);

    public void setWeight(Double value);
}