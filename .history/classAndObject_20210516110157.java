
class Demo {
 public static void main(String args[]) {
  byte x;
  int a = 270;
  double b = 128.128;
  System.out.println("int converted to byte");
  x = (byte) a;
  System.out.println("a and x " + a + " " + x);
  System.out.println("double converted to int");
  a = (int) b;
  System.out.println("b and a " + b + " " + a);
  System.out.println("\ndouble converted to byte");
  x = (byte)b;
  System.out.println("b and x " + b + " " + x);
 }
}

// Classes and Objects in Java Example Programs

// Class Declaration
class Dog {
    // Instance Variables
    String breed;
    String size;
    int age;
    String color;

  
    // method 1
    public String getInfo() {
        return ("Breed is: "+breed+" Size is:"+size+" Age is:"+age+" color is: "+color);
    }
}
public class Execute{
    public static void main(String[] args) {
        Dog maltese = new Dog();
        maltese.breed="Maltese";
        maltese.size="Small";
        maltese.age=2;
        maltese.color="white";
        System.out.println(maltese.getInfo());
    }
} 