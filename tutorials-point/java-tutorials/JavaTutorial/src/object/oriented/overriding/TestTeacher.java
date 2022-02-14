package object.oriented.overriding;

/**
 * @author William
 */
public class TestTeacher {
    public static void main(String[] args) {
        Teacher mathTeacher = new MathTeacher();
        mathTeacher.description();
    }
}