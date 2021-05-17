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
    }
}




