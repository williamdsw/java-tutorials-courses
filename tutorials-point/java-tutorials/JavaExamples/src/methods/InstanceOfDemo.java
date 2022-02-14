package methods;

import java.util.ArrayList;
import java.util.Vector;

/**
 * @author William
 */

// METHODS - INSTANCEOF
public class InstanceOfDemo {

    private static void getClassName(Object object) {
        if (object instanceof ArrayList) {
            System.out.println("Object is instance of ArrayList");
        } else if (object instanceof String) {
            System.out.println("Object is instance of String");
        } else {
            System.out.printf("Object is instance of %s \n", object.getClass());
        }
    }

    public static void main(String[] args) {
        // Data
        Object myArrayList = new ArrayList<>();
        Object myString = new String();
        Object myInteger = new Integer(0);

        // Output
        getClassName(myArrayList);
        getClassName(myString);
        getClassName(myInteger);
    }
}