// static variables
// belongs only to class and not to any object, instantiated only once at start of execution
// can be accessed directly by class name
// single copy shared by all instances of that class

// method only belongs to class not any object (instance)
// has access to only static data, not non-static data (instance variables)
 
class StaticMethodAndVariable{
    public static void main(String[] args) {
        Person s1 = new Person();
        s1.showData();
        Person s2 = new Person();
        s2.showData();
        // access a static variable from outside the class
        Person.var2++;
        s1.showData();
    }
}

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
    // can static method increment access non-static data (instance) var1?
    public static void increment() {
        var1++;
    }
}

// static block
// helps to initialize the static data members

class StaticBlock{
    static int x;
    static int z;
    static {
        x = 999;
        z = 888;
    }
    public static void main(String[] args) {
        System.out.println("Value of static var x = " + x);
        System.out.println("Value of static var z = " + z);
    }
}
