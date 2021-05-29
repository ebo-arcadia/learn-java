package oracle_java_tutorials;

// define a class within another class
// non-static -> inner classes -> access to ohter enclosing class; static nested class does not
// logically grouping classes only used in one place
// increase encapsulation
// readable and easier to maintain

class OuterClass {
    // ...
    class NestedClass {
        // ...
    }
    static class StaticNestedClass {
        // ...
    }
}

// inner classes
// instantiate inner class

class OuterClass {
    class InnerClass {

    }
}

OuterClass outerObject = new OuterClass();
OuterClass.InnerClass innerObject = outerObject.new InnerClass();

// static nested classes
// associate with outer class
// a top level class nested in another top level classes
// instantiate static nested class same way as top-level class

StaticNestedClass staticNestedObject = new StaticNestedClass();


