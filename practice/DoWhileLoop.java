import java.io.*;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String args[]) {
        String password = "password";
        Scanner scannerObj = new Scanner(System.in);
        String input;

        do {
            System.out.print("password?: ");
            input = scannerObj.nextLine().trim();
        } while (!input.equals(password));
        System.out.print("Bingo!");
    }
}