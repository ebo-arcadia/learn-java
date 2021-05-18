public class strings_methods {
    public static void main(String[] args) {
        // declare the string as an object
        String str1 = "Java is like Ruby with different set of syntax to me";

        // what is the length of str1?
        int stringLength = str1.length();
        System.out.println("The string length of str1 is: " + stringLength);

        // using indexOf
        String str2 = "an good apple is an banana is an oxrange";
        System.out.println("sample string for this program is: " + str2);
        // inquire the position of a character:
        System.out.println("index of character 'x': " + str2.indexOf('x'));
        // inquire the position of a character after 5 index
        System.out.println("index of character 's' after 5: " + str2.indexOf('s', 5));
        // get index position of a character in a given substring
        System.out.println("index of 1st character in substring 'apple' is: " + str2.indexOf("apple"));
        // get index position of a character in a given substring after start index 3 skipping the first an
        System.out.println("index of 1st character in substring 'an' after index 3 is: " + str2.indexOf("an", 3));

        // using charAt
    }   
}

class string_methods_charAt {
    public static void main(String[] args) {
        String str1 = "This is a string used for charAt method";
        System.out.println("This is the sample str1: " + str1);

        // returns the character value at index 0
        System.out.println("Charater at 0 position: " + str1.charAt(0));
        // return the character value at index 10
        System.out.println("Charater at 0 position: " + str1.charAt(10));
        // induce error due to index out of range 
        char result = str1.charAt(-1);
        System.out.println("Charater at 0 position: " + result);
    }
}
// charAt method always take an argument always int type
//  int value specifies index starts at 0
// error if index value is higher than string length
// index range must beween 0 and string length - 1

class string_method_compareTo {
    public static void main(String[] args) {
        String str_1 = "ruby";
        String str_2 = "python";
        String str_3 = "swift";
        // param passed to the compareTo method is lexicographically first
        System.out.println("Compare to str_1 'ruby', python is: " + str_1.compareTo("python"));
        // string calling the method is lexicographically first
        System.out.println("Compare to str_2 'python, ruby is: " + str_2.compareTo("ruby"));
        // two strings are lexicographically equivalent
        System.out.println("Compare to str_3 'swift', swift is: " + str_3.compareTo("swift"));
        // compare to - ignore case
        String Str_4 = "angular";
        String Str_5 = "ANGULAR";
        System.out.println("Compare str_4 'angular' to str_5 'ANGULAR' - case ignored, str_4 is: " + str_4.compareToIgnoreCase("ANGULAR"));
    }
}
