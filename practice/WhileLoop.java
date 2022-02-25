import java.io.*;
import java.lang.Thread;

public class WhileLoop {
    public static void main(String args[]) {
        int x = 20;
        try {
            while (x > 0) {
                System.out.print("current x value is: " + x);
                x--;
                Thread.sleep(1000);
                System.out.print("\n");
            }
            System.out.println("Time is up!");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}