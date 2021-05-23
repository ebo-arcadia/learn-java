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
        initVal_1 = 100;
        initVal_2 = 200;
        System.out.println("Inside a constructor");
    }

    public void show(){
        System.out.print("Value_1 === "+initVal_1);
        System.out.print("Value_2 === "+initVal_2);
    }

    public static void main(String args[]) {
        Constructor constructor = new Constructor();
        constructor.show();
    }
}

class Demo{
    int  value1;
    int  value2;
    Demo(){
       value1 = 10;
       value2 = 20;
       System.out.println("Inside Constructor");
   }

   public void display(){
      System.out.println("Value1 === "+value1);
      System.out.println("Value2 === "+value2);
  }

 public static void main(String args[]){
     Demo d1 = new Demo();
    d1.display();
}
}