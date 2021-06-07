package p3;
import p1.*; //imports classes only in package p1 and NOT  in the sub-package p2
class c3{
  public   void m3(){
     System.out.println("Method m3 of Class c3");
  }
  public static void main(String args[]){
    c1 obj1 = new c1();
    obj1.m1();
  }
}