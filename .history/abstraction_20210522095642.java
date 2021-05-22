// only show features to user
// hide unnecessary details
// reduce app complexity
// accomplished with abstract class, method, and inferface

// what is abstract class?
// e.g
// Shape class => inherited by triangle obj produces triangle obj
// Shape class => inherited by rectangle obj procudes rectangle obj
// Shape class produces what object? none! it is no use to be instantiated

// abstract class class_name {
    // code
// }

// what is abstract method?
// method in super class to be inherited
// no need to define it because it is modified in the inheriting sub classes
// no implementation is required, only signiture is defined

// abstract public void method_name();

// exampple program
abstract class abstract_class{
    abstract void abstract_method();
}
public class inheriting_class extends abstract_class{
    void abstract_method() {System.out.println("Abstract method returns...");}
    public static void main(String[] args) {
        abstract_class ref_obj = new inheriting_class();
        ref_obj.run();
    }
}