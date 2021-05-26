// applications: maps, physics, architecture/designs of structures
// java.lang.Math api
// basic: math.E  math.PI

// convert num to absolute value
class math_absolute {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = -10;
        double num3 = -9.8;
        double num4 = -0.31;
        System.out.println("Abolute value of num1 is: " + Math.abs(num1));
        System.out.println("Abolute value of num2 is: " + Math.abs(num2));
        System.out.println("Abolute value of num3 is: " + Math.abs(num3));
        System.out.println("Abolute value of num4 is: " + Math.abs(num4));
    }
}

class math_round {
    public static void main(String[] args) {
        double num1 = 4.6;
        double num2 = 5.4;
        double num3 = 0.45;
        double num4 = 0.51;
        System.out.println("Round off for num1: " + Math.round(num1));
        System.out.println("Round off for num1: " + Math.round(num2));
        System.out.println("Round off for num1: " + Math.round(num3));
        System.out.println("Round off for num1: " + Math.round(num4));
    }
}
