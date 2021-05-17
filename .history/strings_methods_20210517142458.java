public class strings_methods {
    public static void main(String[] args) {
        // declare the string as an object
        String str1 = "Java is like Ruby with different set of syntax to me";

        // what is the length of str1?
        int stringLength = str1.length();
        System.out.println("The string length of str1 is: " + stringLength);

        // using indexOf
        String str2 = "an apple is an banana is an oxrange";
        System.out.println("sample string for this program is: " + str2);
        // inquire the position of a character:
        System.out.println("index of character 'x: " + str2.indexOf('x'));
        // inquire the position of a character after 5 index
        System.out.println("index of character 's' after 5: " + str2.indexOf('s', 5));
        // get index position of a character in a given substring
        System.out.println("index of 1st character in substring 'apple' is: " + str2.indexOf("apple"));
        // get index position of a character in a given substring after start index 3 skipping the first an
        System.out.println("index of 1st character in substring 'an' after index 3 is: " + str2.indexOf("an", 3));
    }   
}