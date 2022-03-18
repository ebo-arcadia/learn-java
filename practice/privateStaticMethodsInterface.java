interface Java9Interface {
    public abstract void publicAbstractMethod();
    public default void invokingPrivateStaticMethods() {
        privateInterfaceMethod();
        privateInterfaceStaticMethod();
        System.out.println("calling private and private static methods in interface default method");
    }
    public static void invokingStaticInStaticMethod() {
        privateInterfaceStaticMethod();    //  static method inside other static method
        System.out.println("invoking private static method in another(public) static method");
    }
    private void privateInterfaceMethod() {    // private method
        System.out.println("invoking private method in interface");
    }
    private static void privateInterfaceStaticMethod() {    // private static method
        System.out.println("invoking private static method in interface");
    }
}
public class privateStaticMethodsInterface implements Java9Interface {
    @Override
    public void publicAbstractMethod() {
        System.out.println("overriding invoking abstract method");
    }
    public static void main(String args[]) {
        Java9Interface instance = new privateStaticMethodsInterface();
        instance.publicAbstractMethod();
        instance.invokingPrivateStaticMethods();
        Java9Interface.invokingStaticInStaticMethod();
    }
}