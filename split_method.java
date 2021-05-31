// break a string given a delimiter
// syntax
// public String split(String regex, int limit)

class splitString {
    public static void main(String[] args) {
        String arrayOfString = "Apple, Orange, Banana, Earth, Metal, Alumunia";
        String[] splittedString = arrayOfString.split(", ");
        for (int i = 0; i < splittedString.length; i++)
        { System.out.println(splittedString[i]);}
    }
}

class splitStringLimit {
    public static void main(String[] args) {
        String arrayOfString = "Apple, Orange, Banana, Earth, Metal, Alumunia";
        String[] splittedString = arrayOfString.split(", ", 2);
        for (int i = 0; i < splittedString.length; i++)
        { System.out.println(splittedString[i]);}
    }
}
class splitStringBySpace {
    public static void main(String[] args) {
        String string = "java is a cool language for certain";
        String[] stringSplitObj = string.split("\\s");
            for (int i = 0; i < stringSplitObj.length; i ++)
            { System.out.println(stringSplitObj[i]);}
    }
}