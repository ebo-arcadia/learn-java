// the sum of power of individual digits is equal to number itself
// xy..z = x^n + y^n+.....+ z^n
// 370 = 3^3 + 7^3 + 0^3
//  = 27 + 343 + 0
//  = 370

package java_programs;

public class armstrong_number {
    public static void main(String[] args) {
        int inputArmstrongNumber = 407; //Input number to check armstrong  
        int tempNumber, digit, digitCubeSum = 0;

          tempNumber = inputArmstrongNumber;
           while (tempNumber != 0)
           {
               
               /* On each iteration, remainder is powered by thetempNumber of digits n
                */
               System.out.println("Current Number is "+tempNumber);
               digit =tempNumber % 10;
               System.out.println("Current Digit is "+digit);
               //sum of cubes of each digits is equal to thetempNumber itself
               digitCubeSum = digitCubeSum + digit*digit*digit;
               System.out.println("Current digitCubeSum is "+digitCubeSum);
               tempNumber /= 10;
              
           }

           //check giventempNumber and digitCubeSum is equal to or not 
           if(digitCubeSum == inputArmstrongNumber)
               System.out.println(inputArmstrongNumber + " is an Armstrong Number");
           else
               System.out.println(inputArmstrongNumber + " is not an Armstrong Number");

    }
}

class ArmstrongNumberRange {
 
    public static void main(String[] args) {
        int tempNumber, digit, digitCubeSum;
 
        for (int inputArmstrongNumber = 0; inputArmstrongNumber < 1000; inputArmstrongNumber++) {
            tempNumber = inputArmstrongNumber;
            digitCubeSum = 0;
            while (tempNumber != 0) {
 
                /* On each iteration, remainder is powered by thetempNumber of digits n
                 */
 
                digit = tempNumber % 10;
 
                //sum of cubes of each digits is equal to thetempNumber itself
                digitCubeSum = digitCubeSum + digit * digit * digit;
 
                tempNumber /= 10;
 
            }
 
            //check giventempNumber and digitCubeSum is equal to or not 
            if (digitCubeSum == inputArmstrongNumber)
                System.out.println(inputArmstrongNumber + " is an Armstrong Number");
 
        }
 
    }
 
}