package classes;

/**
 * @author William
 */
public class ClassUse {
    public static void main(String[] args) {
        showClassUse();
    }

    private static void showClassUse() {
        // Instance and data
        Human human = new Human();
        human.setFirstName("Al");
        human.setLastName("Simmons");
        human.setSpecies("Homo sapiens");
        human.setAge(30);
        human.setHeight(1.82);
        human.setWeight(80.00);

        // Show data
        System.out.println("Name: " + human.getFullName());
        System.out.println("Age: " + human.getAge());
        System.out.println("Species: " + human.getSpecies());
        System.out.println("Height: " + human.getHeight());
        System.out.println("Weight: " + human.getWeight());
    }
}