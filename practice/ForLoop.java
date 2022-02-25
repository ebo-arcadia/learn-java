import java.io.*;
import java.lang.Thread;

public class ForLoop {
    public static void main(String args[]) {
        try {
            for (int i = 0; i <= 100; i += 10) {
                System.out.println("add 10 to each num in each iteration");
                System.out.println("current num is: " + i);
                System.out.println("\n");
                Thread.sleep(1000);
            }
            System.out.print("Happy New Year!");
        }
        catch (Exception err) {
            System.out.print(err);
        }
    }
}