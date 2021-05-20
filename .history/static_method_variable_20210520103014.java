// static variables
// belongs only to class and not to any object, instantiated only once at start of execution
// can be accessed directly by class name
// single copy shared by all instances of that class

// method only belongs to class not any object (instance)
// has access to only static data, not non-static data (instance variables)
 
class Person {
    int var1;
    static int var2; // initialized to 0 only when class is loaded not when instance is created

    Person() {
        // constructor incrementing static var2
        var2++;
    }

    public void showData() {
        System.out.println("Value of var1 = " + var1);
        System.out.println("Value of var2 = " + var2);
    }
}


public class StaticMethodAndVariable{
    public static void main(String[] args) {
        Person s1 = new Person();
        s1.showData();
        Person s2 = new Person();
        s2.showData();
        //Student.b++;
        //s1.showData();
    }
}