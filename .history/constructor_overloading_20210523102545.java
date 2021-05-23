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