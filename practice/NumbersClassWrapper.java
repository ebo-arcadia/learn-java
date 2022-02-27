import java.lang.*;

public class NumbersClassWrapper {
    public static void main(String[] args) {
        Integer x = 100;
        x += 3333;
        Integer y = 100;
        y += 3333;
        int z = 100;
        int i = 5000;

        System.out.println("value of primitive int type x is: " + x);
        System.out.println("\n");
        System.out.println("value of primitive int type y is: " + y);
        System.out.println("\n");
        System.out.println("value of primitive int type z is: " + z);

        System.out.println("\n");
        System.out.println(x.equals(y)); // determines if x and y are the same type as well as with same value
        System.out.println("\n");
        System.out.println(x.equals(z)); // determines if x and z are the same type as well as with same value
        System.out.println("\n");

        System.out.println("\n");
        System.out.println(x.compareTo(y));
        System.out.println("\n");
        System.out.println(y.compareTo(i));
        System.out.println("\n");

        int a = Integer.parseInt("0");
        System.out.println("get the primitive data type of string \"0\" which is int 0" + ": " + a); // print the primitive type value of string "0" which is int 0
        System.out.println("\n");
        double b = Double.parseDouble("10.123");
        System.out.println("get the primitive data type of string \"10.123\" which is double 10.123" + ": " + b);
        System.out.println("\n");

        int j = Integer.valueOf(999);
        System.out.println(j);
        System.out.println("\n");
        double k = Double.valueOf(999);
        System.out.println(k);
        System.out.println("\n");
        float t = Float.valueOf("999");
        System.out.println(t);
        System.out.println("\n");
        Integer w = Integer.valueOf("999");
        System.out.println(w.equals(j)); // determines if primitive j and object w are the same type carry the same value
    }
}