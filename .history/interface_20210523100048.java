// defined abstract specify behavior of class
// 100% abstract class with only abstract methods
// contains static constants & abstract methods
// class can implement multiple inferfaces
// declared using keyword interface in java
// all methods in interface are public & abstract

// syntax
// interface {
    // methods
// }

// why using interface?
// java prohibits multiple inheritance
// java prohibits a class extend two classes

// example program
// class john can extends to class human and implement interface as american
interface American{
    public void test();
}

class John implements American{
    public void test(){
        System.out.println("Interdace method implemented");
    }
    public static void main(String[] args) {
        American citizen = new John();
        citizen.test();
    }
}

// when to use interface and abstract class?
// interface => roles need to be defined for other classes regardless of inheritance
// abstract class => when template needs to be defined by a group of subclasses

// example program to create an interface and abstract class

interface Pet {
    public void test();
}

class Dog implements Pet {
    public void test() {
        System.out.println("Interface method implemented");
    }
    public static void main(String[] args) {
        Pet pet1 = new Dog();
        pet1.test();
    }
}

// abstract class
abstract class Human {
    int age = 100;
    abstract public void getJob();
}

class Christian extends Human{
    public static void main(String[] args) {
        Christian james1 = new Christian();
        james1.age = 333;
    }
    public void getJob() {
        System.out.println("James's age is " + (james1.age * james1.age));
    }
}