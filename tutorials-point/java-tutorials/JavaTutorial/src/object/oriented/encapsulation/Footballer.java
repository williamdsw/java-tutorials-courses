package object.oriented.encapsulation;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author William
 */
public class Footballer {
    private String name;
    private String nationality;
    private Date birthdate;
    private int age;
    private String position;
    private double height;

    public Footballer() {
    }

    public Footballer(String name, String nationality, Date birthdate, int age, String position, double height) {
        this.name = name;
        this.nationality = nationality;
        this.birthdate = birthdate;
        this.age = age;
        this.position = position;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("FOOTBALLER INFORMATIONS: \n");
        builder.append("Name: ").append(this.getName()).append("\n");
        builder.append("Nationality: ").append(this.getNationality()).append("\n");
        builder.append("Birthday: ").append(new SimpleDateFormat("yyyy/MM/dd").format(this.getBirthdate()))
                .append("\n");
        builder.append("Age: ").append(this.getAge()).append("\n");
        builder.append("Position: ").append(this.getPosition()).append("\n");
        builder.append("Height: ").append(this.getHeight()).append("\n");
        return builder.toString();
    }
}