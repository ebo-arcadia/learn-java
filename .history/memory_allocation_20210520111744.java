// stack memory
// memory stores local & reference variables and method
// last in first out
// local variables created in stack

// Heap memory
// memory stores objects and may contains reference variables
// instance variables are created in heap

// memory allocation
// memory set side for storing variables and instances of structures and classes

// secion of memory 
// Code contains bytecode
// Stack contains methods, local & reference variables 
// Heap contains objects maybe reference variables 
// Static contains static data & method

// local vs. instance variable
// class Coding{
//     int python; // python is an instance variable
//     public void showData();
// }

// public void animal(int num){
//     int newNum = num + 100;
//     // num & newNum are local variables
// }

public void m1{
    int x=20
}

public void m2(int b){
    boolean c;
    // more code
    m3()
}

public void m3(){
    Account ref = new Account();
    // more code
}

// what if object has a reference as its instance variable?
public static void main(String[] args) {
    A parent = new A();
}

class A{
    B child = new B();
    int e;
}

class B{
    int c;
    int d;
}
