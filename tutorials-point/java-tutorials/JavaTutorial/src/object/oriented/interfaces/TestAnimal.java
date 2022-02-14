package object.oriented.interfaces;

/**
 * @author William
 */
public class TestAnimal {
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        Dog dog = new Dog();

        // Testing
        System.out.println(mammal instanceof Animal);
        System.out.println(dog instanceof Animal);
        System.out.println(dog instanceof Mammal);
    }
}