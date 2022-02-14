package advanced.data.structures;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * @author William
 */
public class HashTableDemo {
    public static void main(String[] args) {
        // Data
        Hashtable videoGameDevelopers = new Hashtable();
        videoGameDevelopers.put("Playstation", "Sony");
        videoGameDevelopers.put("Xbox", "Microsoft");
        videoGameDevelopers.put("Dreamcast", "Sega");
        videoGameDevelopers.put("Switch", "Nintendo");

        // Output
        Enumeration consoles = videoGameDevelopers.keys();
        while (consoles.hasMoreElements()) {
            String console = (String) consoles.nextElement();
            String developer = (String) videoGameDevelopers.get(console);
            System.out.printf(" %s - %s \n ", console, developer);
        }

        // Updating value
        videoGameDevelopers.put("Dreamcast", "Sega Games Co., Ltd");
        System.out.printf(" %s - %s \n ", "Dreamcast", videoGameDevelopers.get("Dreamcast"));
    }
}