package directories;

import java.io.File;

/**
 * @author William
 */

// DIRECTORIES
public class CheckParentDirectory {
    private static void checkParentDirectory(String path) {
        File file = new File(path);
        String parent = file.getParent();
        String type = (file.isDirectory() ? "directory" : "file");
        System.out.printf("The parent of this %s is %s \n", type, parent);
    }

    public static void main(String[] args) {
        String directoryPath = "D:\\IDE Projetos\\Netbeans\\java-courses\\tutorials-point\\JavaExamples\\files";
        String filePath = "D:\\IDE Projetos\\Netbeans\\java-courses\\tutorials-point\\JavaExamples\\files\\output.txt";
        checkParentDirectory(directoryPath);
        checkParentDirectory(filePath);
    }
}