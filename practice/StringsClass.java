import java.io.*;

public class StringsClass {
    public static void main(String[] args) {

        System.out.print("\n");
        // the simplest way to create an string object using string literal
        String strObj = "this is the value of a string";
        System.out.println("value of strObj is: " + strObj);
        System.out.print("\n");

        // how to create a string object using string class constructor?
        char[] charArry = {'j', 'a', 'v', 'a'};
        String strObjWithCharArry = new String(charArry);
        System.out.println("value of strObjWithCharArry is: " + strObjWithCharArry);
        System.out.print("\n");

        // commonly used static or class methods with string class

        // length()
        int lenOfStrObj = strObj.length();
        System.out.println("length of strObj is: " + lenOfStrObj);
        System.out.print("\n");

        // concatenating string with string obj or string literal
        String str1 = "today ";
        String str2 = "is ";
        String sentence1 = str1.concat(str2);
        String fullSentence = sentence1.concat("a good day");
        System.out.print("the full sentence after concatenation: " + fullSentence);
        System.out.print("\n");

        // find the which character in which position using indexOf
        String aNewString = "this is a string with a seqquence of characters all in lower case Except one";
        char thirdChar = aNewString.charAt(3);
        int onlyUpperCaseChar = aNewString.indexOf("E");
        System.out.print("the 3rd position of character in aNewString is: " + thirdChar);
        System.out.print("\n");
        System.out.print("the position of the capital character E in aNewString is in position/index of: " + onlyUpperCaseChar);
        System.out.print("\n");

        // how to compare two strings and return different output depends on the equality of the two or not?
        String goodString = "Sunday CHURCH service";
        String okayString = "church";

        int compareStrResult = okayString.compareTo(goodString);
        System.out.print("the result after comparing two strings case sensitive: " + compareStrResult);
        System.out.print("\n");

        int compareStrResultCaseInsensitive = okayString.compareToIgnoreCase(goodString);
        System.out.print("the result after comparing two strings case INsensitive: " + compareStrResultCaseInsensitive);
        System.out.print("\n");
    }
}