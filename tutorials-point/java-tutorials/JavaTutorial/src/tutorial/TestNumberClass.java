package tutorial;

/**
 * @author William
 */
public class TestNumberClass {
    public static void main(String[] args) {
        Double myDouble = 1.5;
        Integer intValue = myDouble.intValue();
        Integer compareOther = myDouble.compareTo(1.51);
        boolean isEqual = myDouble.equals(myDouble);
        double absolute = Math.abs(myDouble);
        double ceil = Math.ceil(myDouble);
        double floor = Math.floor(myDouble);
        double rint = Math.rint(myDouble);
        double round = Math.round(myDouble);
        int min = Math.min(10, 20);
        int max = Math.max(10, 20);
        double exp = Math.exp(myDouble);
        double log = Math.log(myDouble);
        double pow = Math.pow(myDouble, myDouble);
        double sqrt = Math.sqrt(myDouble);
        double sin = Math.sin(myDouble);
        double cos = Math.cos(myDouble);
        double tan = Math.tan(myDouble);
        double asin = Math.asin(myDouble);
        double acos = Math.acos(myDouble);
        double atan = Math.atan(myDouble);
        double degrees = Math.toDegrees(myDouble);
        double radians = Math.toRadians(myDouble);
        double random = Math.random();

        // Output
        System.out.printf("myDouble: %f \n", myDouble);
        System.out.printf("int value: %d \n", intValue);
        System.out.printf("%f compared to 1.51 = %s \n", myDouble, (compareOther == 0 ? "Yes" : "No"));
        System.out.printf("%f is equal to %f ? %s \n", myDouble, myDouble, isEqual);
        System.out.printf("absolute of %f = %f \n", myDouble, absolute);
        System.out.printf("ceil of %f = %f \n", myDouble, ceil);
        System.out.printf("floor of %f = %f \n", myDouble, floor);
        System.out.printf("rint of %f = %f \n", myDouble, rint);
        System.out.printf("round of %f = %f \n", myDouble, round);
        System.out.printf("min between 10 ~ 20 = %d \n", min);
        System.out.printf("max between 10 ~ 20 = %d \n", max);
        System.out.printf("exp of %f = %f \n", myDouble, exp);
        System.out.printf("log of %f = %f \n", myDouble, log);
        System.out.printf("pow of %f to %f = %f \n", myDouble, myDouble, pow);
        System.out.printf("sqrt of %f = %f \n", myDouble, sqrt);
        System.out.printf("sin of %f = %f \n", myDouble, sin);
        System.out.printf("cos of %f = %f \n", myDouble, cos);
        System.out.printf("tan of %f = %f \n", myDouble, tan);
        System.out.printf("asin of %f = %f \n", myDouble, asin);
        System.out.printf("acos of %f = %f \n", myDouble, acos);
        System.out.printf("atan of %f = %f \n", myDouble, atan);
        System.out.printf("degrees of %f = %f \n", myDouble, degrees);
        System.out.printf("radians of %f = %f \n", myDouble, radians);
        System.out.printf("random = %f \n", random);
    }
}
