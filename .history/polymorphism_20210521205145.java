// what is polymorphism
// one or more objects or classes related to each other by inheritance 

// method overriding
// redefining super class method in sub class

class Doctor{
    public void treatPatient(){
        // treatPatient method 
    }
}
class Surgeon extends Doctor{
    public void treatPatient(){
        // treatPatient method
    }
}
class run{
    public static void main(String[] args) {
        Doctor doctorObj = new Doctor()
        doctorObj.treatPatient();

        Surgeon sugrgeonObj = new Surgeon();
        sugrgeonObj.treatPatient();
    }
}

// method overloading vs. method overriding
class X{
    public int sum() {
        // code
    }
}
class Y extends X{
    public int sum(){
        // overridden method
    }
}

// dynamic polymorphism
// mechanism by which multiple methods can be defined with the same name and signature in super & sub classes

// static polymorphism
// relates to method overloading

// super method used in child class to access parent class

public class Test{
    public static void main(String args[]){
       X x= new X();
      Y y = new  Y();
      y.m2();
     x.m1();
     y.m1();
    x = y;// parent pointing to object of child
    x.m1() ;
    y.a=10;
  }

}
class X{
  private int a;
  int b;
     public void m1(){
      System.out.println("This is method m1 of class X");
    }
}

class Y extends X{
     int c; // new instance variable of class Y
        public void m1(){
           // overriden method
           System.out.println("This is method m1 of class Y");
       }
      public void m2(){
          super.m1();
          System.out.println("This is method m2 of class Y");
     }
}