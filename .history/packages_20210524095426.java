// collections of classes, sub-packages, and interfaces
// each package has a unique name
// syntax: package nameOfPackage
// why using packages? keeping codes organized and re-usuable

// create a package

package javaPackage1.subJavaPackage;

class sampleClass {
    public void method1() {
        System.out.println("this is method 1 in sample class");
    }

    public static void main(String[] args) {
        sampleClass obj1 = new sampleClass();
    }
}

// type in the CLI
// javac -d . packages.java
// execute sample class in this package/subpackage in CLI
// java javaPackage1.subJavaPackage.sampleClass

// import Package
// syntax : import packageName

// package javaPackage2;
