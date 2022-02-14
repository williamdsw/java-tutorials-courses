package basic;

/**
 * @author William
 */
public class VariableTypes {
    public static void main(String[] args) {
        showVariableTypes();
    }

    private static void showVariableTypes() {
        byte myByte = 127;
        short myShort = 32767;
        int myInt = 2147483647;
        long myLong = 22504102899L;
        float myFloat = 3.14F;
        double myDouble = 1500.99;
        boolean myBoolean = false;
        char myChar = 'W';
        String myString = "William";

        // Wrappers
        Byte otherByte = 127;
        Short otherShort = 32767;
        Integer otherInteger = 2147483647;
        Long otherLong = 22504102899L;
        Float otherFloat = 3.14F;
        Double otherDouble = 1500.99;
        Boolean otherBoolean = false;
        Character otherCharacter = 'W';

        System.out.println("myByte: " + myByte);
        System.out.println("myShort: " + myShort);
        System.out.println("myInt: " + myInt);
        System.out.println("myLong: " + myLong);
        System.out.println("myFloat: " + myFloat);
        System.out.println("myDouble: " + myDouble);
        System.out.println("myBoolean: " + myBoolean);
        System.out.println("myChar: " + myChar);
        System.out.println("myString: " + myString);

        // Wrappers
        System.out.println("otherByte: " + otherByte);
        System.out.println("otherShort: " + otherShort);
        System.out.println("otherInt: " + otherInteger);
        System.out.println("otherLong: " + otherLong);
        System.out.println("otherFloat: " + otherFloat);
        System.out.println("otherDouble: " + otherDouble);
        System.out.println("otherBoolean: " + otherBoolean);
        System.out.println("otherCharacter: " + otherCharacter);
    }
}