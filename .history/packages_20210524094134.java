// collections of classes, sub-packages, and interfaces
// each package has a unique name
// syntax: package nameOfPackage
// why using packages? keeping codes organized and re-usuable

// create a package

package javaPackage1;

class sampleClass {
    public void method1() {
        System.out.println("this is method 1 in sample class");
    }

    public static void main(String[] args) {
        sampleClass obj1 = new sampleClass();
    }
}