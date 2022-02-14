package advanced.data.structures;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * @author William
 */
public class PropertiesDemo {
    public static void main(String[] args) {
        // Data
        Properties capitals = new Properties();
        capitals.setProperty("São Paulo", "São Paulo");
        capitals.setProperty("Rio de Janeiro", "Rio de Janeiro");
        capitals.setProperty("Paraná", "Curitiba");
        capitals.setProperty("Bahia", "Salvador");
        capitals.setProperty("Ceará", "Fortaleza");
        capitals.setProperty("Minas Gerais", "Belo Horizonte");

        // Output
        Set states = capitals.keySet();
        Iterator iterator = states.iterator();

        while (iterator.hasNext()) {
            String state = (String) iterator.next();
            String capital = capitals.getProperty(state);
            System.out.printf(" Capital of %s is %s. \n", state, capital);
        }
    }
}