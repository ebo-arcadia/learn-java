import java.io.*;

public class IfElseIf {
    public static void main(String args[]) {
        String a = "java";
        String b = "python";
        String c = "go";

        if (a == "javac") {
            System.out.print("a is java");
        } else if (b == "pycharm") {
            System.out.print("a is java");
        } else if (c == "go") {
            System.out.print("c is go");
            System.out.print("\n");
        } else {
            System.out.print("all conditions are false");
        }
        System.out.print("statement c is go should be printed");
    }
}