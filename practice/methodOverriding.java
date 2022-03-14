class Animal {
    public void move() {
        System.out.println("Animals can move");
    }
    // method with keyword final or static can not be overridden
    public static void eat() {
        System.out.println("Animals can eat");
    }
}

class Dog extends Animal {
    @Override
    public void move() {
        System.out.println("Dogs can walk and run\n");
        System.out.print("attempt calling the overriden method move from the super class Animal: \n");
        super.move(); // call the overridden method move from the Animal class
    }
    public void bark() {
        System.out.println("Dogs can bark");
    }
    public static void eat() {
        System.out.println("Dogs can eat");
    }
}

public class methodOverriding {

    public static void main(String args[]) {
        Animal a = new Animal();   // Animal reference and object
        Animal b = new Dog();   // Animal reference but Dog object
        Dog dog = new Dog();

        a.move();   // runs the method in Animal class
        b.move();   // runs the method in Dog class
        dog.bark();
        dog.eat();
        a.eat();
        b.eat();
    }
}