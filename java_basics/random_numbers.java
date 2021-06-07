// using random class in package java utility and built-in method nextInt

import java.util.Random;
class RandomNums {
    public static void main(String[] args) {
        Random objGenerator = new Random();
        for (int counter = 0; counter < 10; counter++ ) {
            int randomNumbers = objGenerator.nextInt(100);
            System.out.println("Random No: " + randomNumbers);
        }
    }
}

// what if to generate 10 random nums in the range of 0.0 to 1.0?
class randomfloatNum {
    public static void main(String[] args) {
        for (int counter = 0; counter < 20; counter ++) {
            System.out.println("20 random floating nums: " + Math.random());
        }
    }
}

