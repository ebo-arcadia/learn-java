public class commandLineArguments {
    public static void main(String argsSample[]) {
        System.out.println("Argument one = " + argsSample[0]);
        System.out.println("Argument two = " + argsSample[1]);
    }
}

public class Echo {
    public static void main (String[] args) {
        for (String s: args) {
            System.out.println(s);
        }
    }
}
