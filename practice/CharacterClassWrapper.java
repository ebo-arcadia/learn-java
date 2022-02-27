import java.lang.*;
import java.util.*;

public class CharacterClassWrapper {
    public static void main(String[] args) {
        // Character str = 'str';
        // primitive char str is boxed to a Character object called str

        // Unicode for uppercase Greek omega character
        char uniChar = '\u039A';

        String letters = "this is a string";
        char[] charArr = new char[letters.length()]; // create an array length of the string
        for (int i = 0; i < letters.length(); i++) {
            charArr[i] = letters.charAt(i);
        }
        for (char c: charArr) {
            System.out.print(c);
            System.out.print("/n");
        }

        System.out.println("\n");
        System.out.println(uniChar);
        System.out.println("\n");

        // Create three char primitives ch1, ch2 and ch3.
        char ch1, ch2, ch3;
        // Assign the values to ch1, ch2 and ch3.
        ch1 = 'A';
        ch2 = '9';
        ch3 = 'e';
        // Create three boolean primitives b1, b2 and b3;
        boolean b1, b2, b3;
        // Check whether ch1, ch2 and ch3 are letters or not and assign the results to b1, b2 and b3.
        b1 = Character.isLetter(ch1);
        b2 = Character.isLetter(ch2);
        b3 = Character.isLetter(ch3);

        String str1 = "The character "+ch1 + " is a letter: " + b1;
        String str2 = "The character "+ch2 + " is a letter: " + b2;
        String str3 = "The character "+ch3 + " is a letter: " + b3;

        // Print the values of b1, b2 and b3.
        System.out.println( str1 );
        System.out.println( str2 );
        System.out.println( str3 );

    }
}