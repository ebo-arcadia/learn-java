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
        System.out.println("which one is bigger, num3 or num4? " + Math.max(num3, num4));
    }
}

// exponential & logarithmic methods

class exp_log_methods {
    public static void main(String[] args) {
        double d1 = 84.6;
        double d2 = 0.45;
        System.out.println("exp(" + d2 + ") = " + Math.exp(d2));
      
        System.out.println("log(" + d2 + ") = " + Math.log(d2));
      
        System.out.println("pow(5, 3) = " + Math.pow(5.0, 3.0));
      
        System.out.println("sqrt(16) = " + Math.sqrt(16));
    }
}
