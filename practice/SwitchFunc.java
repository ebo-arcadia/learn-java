import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class SwitchFunc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create a scanner object
        String recommendation;
        int user_input;

        do {
            System.out.print("\n");
            System.out.print("-------------------");
            System.out.print("Choose a programming language from the following for recommendation: "); // prompt the user to enter a value
            System.out.println("\n1 - python\n2 - java\n3 - javascript\n");
            user_input = input.nextInt(); // read user input

            switch (user_input) {
                case 1:
                    recommendation = "python is recommended for handling machine learning tasks.";
                    break;
                case 2:
                    recommendation = " java is widely used for building enterprise level applications";
                    break;
                case 3:
                    recommendation = " javascript is popular for building web application";
                    break;
                default:
                    recommendation = "invaid input";
                    break;
            }
            System.out.print(recommendation);
        } while (user_input < 4);
    }
}


