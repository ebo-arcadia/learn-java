// mechanism in which one class acquires the property of another class
// reusability of methods and fields

// single inheritance
// multiple inheritance (java does not support it)
// multilevel inheritance (java does not support it)
// hierarchical inheritance
// hybrid inheritance (java does not support it)

// parent class => super class
// inherited class => subclass
// extends => used by sub class to inherit features of super class

// inheritance example 

class Person {
    void Person_Bio() {
        System.out.println("Person Bio...");
    }
}

class Student extends Person {
    void Student_Details() {
        System.out.println("Student Details...");
    }
}

public class School {
    public static void main(String[] args) {
        Student std = new Student();
        std.Person_Bio();
        std.Student_Details();
    }
}

