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

class math_ceil_floor {
    public static void main(String[] args) {
        double num1 = 98.8;
        double num2 = 0.33;
        System.out.println("ceiling of num1: " + Math.ceil(num1));
        System.out.println("floor of num1: " + Math.floor(num1));
        System.out.println("eiling of num2: " + Math.ceil(num2));
        System.out.println("floor of num2: " + Math.floor(num2));
    }
}

class math_min_max {
    public static void main(String[] args) {
        double num1 = -45.34;
        double num2 = -30.89;
        int num3 = 40;
        long num4 = 51;
        System.out.println("which one is smaller, num1 or num2? " + Math.min(num1, num2));
    }
}

// exponential & logarithmic methods

