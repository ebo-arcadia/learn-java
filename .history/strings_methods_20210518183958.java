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
        System.out.println("Compare str_4 'angular' to str_5 'ANGULAR' - case ignored, str_4 is: " + Str_4.compareToIgnoreCase("ANGULAR"));
        // compare to - not ignore case
        System.out.println("Compare str_5 'ANGULAR' to str_4 'angular', str_5 is: " + Str_5.compareTo("angular"));
    }
}

// when to use the compareTo method? perform natural sorting on string

class compare_strings_conditional {
    public static void main(String[] args) {
        
    String string_us = "us";
    String string_uk = "uk";
    System.out.println("String_us is: " + string_us);
    System.out.println("String_uk is: " + string_uk);

    // compare the two strings
    int compareUSAndUK = string_us.compareTo(string_uk);

    // show comparing result
    if (compareUSAndUK < 0) {System.out.println(string_us + " is lexicographically higher than " + string_uk);}
    else if (compareUSAndUK == 0) {System.out.println(string_us + " is lexicographically equal to " + string_uk);}
    else if (compareUSAndUK > 0) {System.out.println(string_us + " is lexicographically less than " + string_uk);}
    }   
}

// using contains method to check if specific set of characters are part of the given string

class contains_method {
    public static void main(String[] args) {
        String sample_str = "This is a string with a Bunch of Characters";
        System.out.println("sample str is: " + sample_str);

        // check if string contains certain sequence of characters
        System.out.println("Does sample_str contains 'is'? " + sample_str.contains("is"));
        // contains method is case sensitive
        System.out.println("Does sample_str contains 'bunch'? " + sample_str.contains("bunch"));
        System.out.println("Does sample_str contains 'Bunch'? " + sample_str.contains("Bunch"));

        // using conditional statement to check specific substring in a given string
        if (sample_str.contains("Characters")) { System.out.println("The word 'Characters' is found in sample str");}
        else { System.out.println("The word 'Characters' is NOT found in sample str");}

        if (sample_str.contains("With")) { System.out.println("The word 'With' is found in sample str");}
        else { System.out.println("The word 'With' is NOT found in sample str");}
    }
}

// endsWith method used to check if the end of string matches user-specified substring

class endsWith_method {
    public static void main(String[] args) {
        String sample_string = "This string ends with jave tools";
        System.out.println("sample_string is: " + sample_string);

        // check if ends with a particular sequence of characters
        System.out.println("sample string ends with 's'? " + sample_string.endsWith("s"));
        System.out.println("sample string ends with 'tools'? " + sample_string.endsWith("tools"));
        System.out.println("sample string ends with 'dev'? " + sample_string.endsWith("dev"));
    }
}

// replace method -> returns a new string by replacing (all) old characters with new one in a string
class replace_method {
    public static void main(String[] args) {
        String strX = new String("the banana is the kind of fruit sweet and tasty!");
        System.out.println("sample string is: " + strX);
        // replace grammatically wrong use of the with a
        System.out.println("the correct sentence is: " + strX.replace("the", "a"));
    }
}

// replaceAll method -> return a new string after finding and replacing matching regx
class replace_all_method {
    public static void main(String[] args) {
        String stringZ = new String("p h i l o s o p h y");
        System.out.println("weird string: " + stringZ);
        // replace all space with no space
        System.out.println("fixed word is now: " + stringZ.replaceAll("\\s", ""));
    }
}

// replaceFirst method -> return a new string replacing only the frist substring matches a given regular expression
class replace_first_method {
    public static void main(String[] args) {
        String strDeta = new String("The user name is Neo");
        System.out.print("registered string is: " + strDeta);
        // replace Neo with new input
        System.out.print("Registered string content is: " + strDeta.replaceFirst("Neo", ": (enter your name here)"));
    }
}

// to lower case method converts every character of a string into lower case
// using rule of default locale
class toLowerOrUpperCase_method {
    public static void main(String[] args) {
        String allCapStr = new String("ALL CAP LETTERS IN THIS STRING MUST BE LOWER CASE!");
        System.out.print("current string is: " + allCapStr);
        System.out.print("converted string is: " + allCapStr.toLowerCase());
        String allLowerStr = new String("all lower case letters in this string must be capitalized pls!");
        System.out.print("current string is: " + allLowerStr);
        System.out.print("converted string is: " + allCapStr.toUpperCase());
    }
}

// convert strings to integer to perform numeric operation
class numericOps {
    public static void main(String []args) {
        String strNum = "1000";
        int convertedStringToNum = Integer.parseInt(strNum);
        System.out.println("Current string number is: " + strNum);
        // perform numeric operation on string
        System.out.println("Perform numeric operation: " + (strNum/25));
        // convert string to integer than perform numeric operation
        
        System.out.println("Perform numeric operation after conversion: " + (strNum*25));
    }
}

class StrConvert{
    public static void main(String []args){
      String strTest = "100";
      int iTest = Integer.parseInt(strTest);
      System.out.println("Actual String:"+ strTest);
      System.out.println("Converted to Int:" + iTest);
      //This will now show some arithmetic operation
      System.out.println("Arithmetic Operation on Int: " + (iTest/4));
    }
  }