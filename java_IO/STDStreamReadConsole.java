import java.io.*;

public class STDStreamReadConsole {
    public static void readConsole() throws IOException {
        InputStreamReader userInput = null;

        try {
            userInput = new InputStreamReader(System.in);
            System.out.println("Enter a character to be printed in console. press 'q' to quit the program.\n");
            System.out.println("-------------------");
            System.out.println("press 'q' to quit the program.");
            char input;
            do {
                input = (char) userInput.read();
                System.out.print("letter you entered:");
                System.out.print(input);
            } while (input != 'q');
        } finally {
            if (userInput != null) {
                userInput.close();
            }
        }
    }

    public static void main(String args[]) throws IOException {
        try {
            readConsole();
        }
        catch (IOException error) {
            System.out.print(error);
        }
    }
}