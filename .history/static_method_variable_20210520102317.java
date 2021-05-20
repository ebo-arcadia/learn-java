// static variables
// belongs only to class and not to any object, instantiated only once at start of execution
// can be accessed directly by class name
// single copy shared by all instances of that class

// method only belongs to class not any object (instance)
// has access to only static data, not non-static data (instance variables)

class StaticMethodAndVariable{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.showData();
        Student s2 = new Student();
        s2.showData();
    }
}

class Demo{
    public static void main(String args[]){
      Student s1 = new Student();
      s1.showData();
      Student s2 = new Student();
      s2.showData();
      //Student.b++;
      //s1.showData();
   }
 }
 
 class Student {
 int a; //initialized to zero
 static int b; //initialized to zero only when class is loaded not for each object created.
 
   Student(){
    //Constructor incrementing static variable b
    b++;
   }
 
    public void showData(){
       System.out.println("Value of a = "+a);
       System.out.println("Value of b = "+b);
    }
 //public static void increment(){
 //a++;
 //}
 
 }