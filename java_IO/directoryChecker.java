// write a program to list sub-dirs and files in a given dir
import java.io.*;

public class directoryChecker {
    public static void readdirs() throws Exception {
        File filesPath = null;
        String[] paths;

        try {
            filesPath = new File("/Users/ebolee/repo/learn-java/java_IO");
            paths = filesPath.list();

            for (String path: paths) {
                System.out.println(path);
            }
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    public static void main(String args[]) throws Exception {
        readdirs();
    }
}