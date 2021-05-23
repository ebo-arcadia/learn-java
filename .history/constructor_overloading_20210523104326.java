// used to initialize newly created object
// called right after memory allocation
// desired values or default value at the time of creation
// numeric data type defaul => 0; character data => null; reference variable => null

// example program to write constructor
// same name as the class
// no value should returned

class Constructor{
    int initVal_1;
    int initVal_2;
    Constructor() {
        initVal_1 = 1;
        initVal_2 = 2;
        System.out.println("Inside a constructor");
    }

    public void show(){
        System.out.println("Value_1 === "+initVal_1);
        System.out.println("Value_2 === "+initVal_2);
    }

    public static void main(String args[]) {
        Constructor constructor = new Constructor();
        constructor.show();
    }
}

// constructor overloading 
// technique, a class to have numbers of constructors
// differ in parameter list
class constructor_overloading{
    int value1;
    int value2;
    constructor_overloading() {
        value1 = 111;
        value2 = 222;
        System.out.println("Inside 1st constructor...");
    }
    constructor_overloading(int x) {
        value1 = x;
        System.out.println("Inside 2nd constructor...");
    }
    constructor_overloading(int x, int y) {
        value1 = x;
        value2 = y;
        System.out.println("Inside 3rd constructor...");
    }

    public void display() {
        System.out.println("Value 1 === " + value1);
        System.out.println("Value 2 === " + value2);
    }
    public static void main(String[] args) {
        constructor_overloading constructor_1 = new constructor_overloading();
        constructor_overloading constructor_2 = new constructor_overloading(300);
        constructor_overloading constructor_3 = new constructor_overloading(400, 500);
        constructor_1.display();
        constructor_2.display();
        constructor_3.display();
    }
}

// constructor chaining
// constructor in parent class invoked every time a child object class is created

class Demo{
    int  value1;
    int  value2;
     Demo(){
       value1 = 1;
       value2 = 2;
       System.out.println("Inside 1st Parent Constructor");
    }
    Demo(int a){
       value1 = a;
       System.out.println("Inside 2nd Parent Constructor");
    }
   public void display(){
      System.out.println("Value1 === "+value1);
      System.out.println("Value2 === "+value2);
   }
   public static void main(String args[]){
      DemoChild d1 = new DemoChild();
      d1.display();
   }
 }