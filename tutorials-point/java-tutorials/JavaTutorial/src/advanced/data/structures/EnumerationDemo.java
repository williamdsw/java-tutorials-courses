package advanced.data.structures;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author William
 */
public class EnumerationDemo {
    public static void main(String[] args) {
        // Data
        Vector planetNames = new Vector();
        planetNames.add("Mercury");
        planetNames.add("Venus");
        planetNames.add("Earth");
        planetNames.add("Mars");
        planetNames.add("Jupiter");
        planetNames.add("Saturn");
        planetNames.add("Neptune");
        planetNames.add("Uranus");

        // Output
        Enumeration planets = planetNames.elements();
        while (planets.hasMoreElements()) {
            System.out.println(planets.nextElement());
        }
    }
}