import java.io.*;

public class NestedIf {
    public static void main(String args[]) {
        String a = "solar system";
        String b = "earth planet";
        String c = "continent";

        if (a == "solar system") {
            System.out.print("statement a is true, humans live in the solar system");
            System.out.print("\n");
            if (b == "earth planet") {
                System.out.print("statement b is true, humans also live on earth planet");
                System.out.print("\n");
                System.out.print("b is evaluated only when a is true");
                System.out.print("\n");
                if (c == "continent") {
                    System.out.print("statement c is true, humans live on continent");
                    System.out.print("\n");
                    System.out.print("c is evaluated only when a & b are true");
                    System.out.print("\n");
                }
            }
        }
        System.out.print("out & end of the nested if statement...");
        System.out.print("\n");
    }
}