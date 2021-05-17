// strings: array of character
// why strings? process human language
// string class extends object class

// representation of array of characters
char[] stringSample = {'s', 'o', 's'};
String str0 = new String(stringSample);

// example string concatenation program

public class Sample_String{
    public static void main(String[] arges){
        // string concatenation

        String str1 = "learning Java ";
        String str2 = "is fun";
        System.out.println("str1 is: " + str1);
        System.out.println("str2 is: " + str2);
        // method 1: using concat
        String str3 = str1.concat(str2);
        System.out.println(str3);
        // method 2: using + operator
        String str4 = str1 + str2;
        System.out.println(str4);
        // length of a string
        System.out.println("the length of string: " + str4.length());
        // find location of a character in a string
        System.out.println("Character at position 2" + str1.charAt(2));
        // find the index of a character in a string
        System.out.println("index of character E: " + str3.indexOf('e'));

        // compare two strings
        String str5 = "Learn to code with java";
        String str6 = "LEARN TO CODE WITH JAVA";
        System.out.println("Compare str5 to str6: " + str5.compareTo(str6));
        // compare ingore case sensitive
        System.out.println("Compare str5 to str6 case ignored: " + str6.compareToIgnoreCase(str5));

        // how to confirm if string contains a sequence of specified characters
        String str7 = "Once upon a time, someone invented the first computer...";
        System.out.println("Contains sequence characters 'computer'?: " + str7.contains("computer"));

        // how to specify the suffix in arguments
        String str8 = "how to specify if this tring ends with java";
        System.out.println("Str 8 ends with 'java': " + str8.endsWith("java"));

        // how to modify string at severl places and replace several parts of the string
        // reaplce, replaceall, replaceFirst methods
        String str9 = "This salad tastes awful!";
        System.out.println("Replace 'awful' with 'delicious' in str9: " + str9.replace("awful", "delicious"));

        // how to make strings lower or upper case?

        String str10 = "this whole sentence needs to be upper case!";
        System.out.println("str10 is: " + str10);
        System.out.println("convert all letters in str10 to upper case: " + str10.toUpperCase());

        String str11 = "THIS SENTENCE NEEDS TO BE LOWER CASE SO I CAN READ IT!";
        System.out.println("str11 is: " + str11);
        System.out.println("convert all letters in str11 to lower case: " + str11.toLowerCase());
    }
}




