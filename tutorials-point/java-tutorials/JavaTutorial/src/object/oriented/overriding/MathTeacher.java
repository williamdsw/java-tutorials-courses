package object.oriented.overriding;

/**
 * @author William
 */
public class MathTeacher extends Teacher {
    @Override
    public void description() {
        super.description();
        System.out.println("Teaches about math...");
    }
}