package methods;

/**
 * @author William
 */

// METHODS - ENUMERATORS
public class EnumeratorDemo {
    public static void main(String[] args) {
        Cars myCar = Cars.TOYOTA_AE86;

        // Output
        switch (myCar) {
            case HONDA_CIVIC: {
                System.out.println("My car is Honda Civic");
                break;
            }

            case MITSUBISHI_LANCER_EVOLUTION: {
                System.out.println("My car is Mitsubishi Lancer Evolution");
                break;
            }

            case MAZDA_RX7: {
                System.out.println("My car is Mazda RX7");
                break;
            }

            case NISSAN_SILEIGHTY: {
                System.out.println("My car is Nissan SiLeighty");
                break;
            }

            case NISSAN_SILVIA: {
                System.out.println("My car is Nissan Silvia");
                break;
            }

            case NISSAN_SKYLINE: {
                System.out.println("My car is Nissan Skyline");
                break;
            }

            case SUBARU_IMPREZA: {
                System.out.println("My car is Subaru Impreza");
                break;
            }

            case TOYOTA_AE86: {
                System.out.println("My car is Toyota AE86");
                break;
            }

            default: {
                break;
            }
        }

        System.out.println("Do you like my car ?");
    }
}