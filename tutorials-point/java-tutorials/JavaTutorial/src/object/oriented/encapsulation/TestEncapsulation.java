package object.oriented.encapsulation;

import java.util.Date;

/**
 * @author William
 */
public class TestEncapsulation {
    public static void main(String[] args) {
        // Data
        Footballer footballer = new Footballer();
        footballer.setName("David Beckham");
        footballer.setNationality("British");
        footballer.setBirthdate(new Date(168231600000L));
        footballer.setAge(44);
        footballer.setPosition("Midfielder");
        footballer.setHeight(1.83);

        // Output
        System.out.println(footballer.toString());
    }
}