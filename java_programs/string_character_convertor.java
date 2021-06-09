public class CharToString_toString {
    public static void main(String[] args) {
        char newCharacter = 'A';
        String newString = Character.toString(newCharacter);
        System.out.println("String is: " + newString);
    }
}

public class CharToString_valueOf {
    public static void main(String[] args) {
      char myChar = 'g';
      //valueOf method take character parameter and convert string.
      String myStr = String.valueOf(myChar);
      ////print string value
      System.out.println("String is: " + myStr);
    }
  }

    class StringToChar {
      public static void main(String[] args) {
          String str = "this is a string";
          int stringLength = str.length();
          for (int i = 0; i < stringLength; i++) {
              char newChar = str.charAt(i);
              System.out.println("Character at " + i + "position: " + newChar);
          }
      }
  }