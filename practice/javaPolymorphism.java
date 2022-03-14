// what is polymorphism?
// the same entity (method, operator or object) can perform different operations in different scenarios

// why using polymorphism? what problems does it solve or what benefits it solve?
// it reduces code redundency
// it increases code reusuability
// instead of writing renderA, renderB, renderC...just write one render() for different scenarios

// how polomorphsism is achieved?
// via method overrriding at run-time / execution
// via method overloading

// what is method overloading and why use it?
// same method (name) performs different operations based on different parameters (func(), func(int a), func(int a, char b)...)
// when it is used?
// at compile time therefore it is also called compile-time polymorphism

// what is operator overloading?
// same operators (+ for example) used to perform different operations
// for numerics, it performs mathematical addition; for strings, it performs concatenation

// what is polymorphic variables?
// a variable is polymorphic when it is referred to different values  under different conditions

import java.io.*;

class Polygon {

    // method to render a shape
    public void render() {
        System.out.println("Rendering Polygon...");
    }
}

class Square extends Polygon {

    // renders Square
    public void render() {
        System.out.println("Rendering Square...");
    }
}

class Circle extends Polygon {

    // renders circle
    public void render() {
        System.out.println("Rendering Circle...");
    }
}

class Language {
    public void displayInfo() {
        System.out.println("Common English Language");
    }
}

class Java extends Language {
    @Override
    public void displayInfo() {
        System.out.println("Java Programming Language");
    }
}

class Pattern {

    // method without parameter
    public void getPattern() {
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }

    // method with single parameter
    public void getPattern(char symbol) {
        for (int i = 0; i < 10; i++) {
            System.out.print(symbol);
            System.out.print("\n");
        }
    }
}

// instance variable overloading
// also upcasting in java

class ProgrammingLanguage {
    public void show() {
        System.out.println("I am Programming Language.");
    }
}

class Python extends ProgrammingLanguage {
    @Override
    public void show() {
        System.out.println("I am a scripted Programming Language.");
    }
}

class javaPolymorphism {
    public static void main(String[] args) {

        // create an object of Square
        Square s1 = new Square();
        s1.render();
        System.out.print("------\n");

        // create an object of Circle
        Circle c1 = new Circle();
        c1.render();
        System.out.print("------\n");

        // create an object of Java class
        Java j1 = new Java();
        j1.displayInfo();
        System.out.print("------\n");

        // create an object of Language class
        Language l1 = new Language();
        l1.displayInfo();
        System.out.print("------\n");

        // create an object of Pattern class
        Pattern pattern = new Pattern();
        // call method without parameters
        pattern.getPattern();
        // call method parameters
        pattern.getPattern('@');

        // operators overloading
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.print("operator overloading for math: ");
        System.out.print(sum);
        System.out.print("\n---------\n");

        String str1 = "python is ";
        String str2 = "awesome!";
        String sentence = str1 + str2;
        System.out.print("operator overloading for concatenation: ");
        System.out.print(sentence);
        System.out.print("\n---------\n");

        // polymorphic variables
        // declare an object / instance variable
        ProgrammingLanguage proLan;

        // create object of ProgrammingLanguage
        proLan = new ProgrammingLanguage();
        proLan.show();
        System.out.print("\n---------\n");

        // create object of Java class
        proLan = new Python();
        proLan.show();
    }
}

// method render is considered as polymorphic
// because it renders different statemetents depending on which class / objects are used
