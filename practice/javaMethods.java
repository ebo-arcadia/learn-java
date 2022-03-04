import java.io.*;
import java.util.*;

public class javaMethods {

    public static void main(String args[]) {
        System.out.println("minimum of two ints: " + findMinOfTwo(3, 4));
        System.out.println("minimum of two doubles: " + findMinOfTwo(9.2, 5.8));
        System.out.print("---------");
        System.out.print("\n");
        Person person1 = new Person();
        person1.setAge(3);
        person1.setName("Neo");
        System.out.print(person1);
        System.out.print("---------");
        System.out.print("\n");
        swapMethod('1', '2');
        // how to execute methods from command line interface / terminal?
        // what is command line argument? statements directly follow the program's name on command line when it is executed
        System.out.print("---------");
        System.out.print("\n");
        System.out.print("passing info into a program when it runs in CLI");
        for (int c = 0; c < args.length; c++) {
            System.out.println("argument[" + c + "] value: " + args[c]);
        }
        System.out.print("---------");
        System.out.print("\n");
        args[0] = " changed";
        System.out.print("changing value for the first argument: " + args[0]);
        System.out.print("---------");
    }

    public static int findMinOfTwo(int a, int b) {
//        int min;
//        if (a > b) {
//            min = b;
//        } else {
//            min = a;
//        }
//        return min;
        int min = a > b ? b : a;
        return min;
    }

    // methods overloading. same method name in a class but different parameters
    public static double findMinOfTwo(double x, double y) {
        double min = x > y ? y : x;
        return min;
    }

    public static void swapMethod(char x, char y) {
        System.out.println("Before invoking swapMethod, x = " + x + " and y is " + y);
        // swap position of x and y
        char z = x;
        x = y;
        y = z;
        System.out.println("After invoking swapMethod, x = " + x + " and y is " + y);
    }
}

    class Person {
        int age = 0;
        String name;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age > 0 ? age : age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name + " is " + age + " year-old.";
        }

    }