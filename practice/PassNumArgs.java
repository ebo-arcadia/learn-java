import java.io.*;

public class PassNumArgs {

    public static void main(String args[]) {
        findMaxfromArgs(1.2, 2.3, 4.1, 6.4);
    }

    public static double findMaxfromArgs(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed.");
            return 0;
        }

        double CurrMaxNum = numbers[0];

        for (int c = 0; c < numbers.length; c++) {
            if (numbers[c] > CurrMaxNum) {
                CurrMaxNum = numbers[c];
            }
        }
        System.out.print("element with max value in passed parameters:" + CurrMaxNum);
        return CurrMaxNum;
    }
}