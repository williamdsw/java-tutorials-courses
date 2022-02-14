package advanced;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author William
 */
public class ClassForNameExample {
    public static void main(String[] args) {
        readClassInformation();
    }

    private static void readClassInformation() {
        try {
            Class<?> object = Class.forName("java.lang.String");

            // Properties
            String name = object.getName();
            String canonicalName = object.getCanonicalName();
            String simpleName = object.getSimpleName();
            String typeName = object.getTypeName();
            String genericString = object.toGenericString();

            // Output
            System.out.println("########## java.lang.String ##########");
            System.out.println("Name: " + name);
            System.out.println("Canonical Name: " + canonicalName);
            System.out.println("Simple Name: " + simpleName);
            System.out.println("Type Name: " + typeName);
            System.out.println("Generic String: " + genericString);
            System.out.println("Package: " + object.getPackage());

            // Fields
            System.out.println("");
            System.out.println("========== FIELDS ==========");

            Field[] fields = object.getDeclaredFields();
            for (Field f : fields) {
                System.out.println("Name: " + f.getName());
                System.out.println("Generic String: " + f.toGenericString());
                System.out.println("");
            }

            // Methods
            System.out.println("");
            System.out.println("========== METHODS ==========");

            Method[] methods = object.getDeclaredMethods();
            for (Method m : methods) {
                System.out.println("Name: " + m.getName());
                System.out.println("Generic String: " + m.toGenericString());
                System.out.println("Parameter Count: " + m.getParameterCount());
                System.out.println("");
            }
        } catch (ClassNotFoundException | SecurityException e) {
            System.out.println(e.getMessage());
        }
    }
}