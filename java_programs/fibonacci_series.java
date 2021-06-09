// what is it - a series of numbers in which next number is the sum of the previous two
// what is wythoff array?

// program logic
// previousNumber is initialized to 0 and nextNumber is initialized to 1
// The Fibonacci For Loop iterates through maxNumber
// Display the previousNumber
// Calculates sum of previousNumber and nextNumber
// Updates new values of previousNumber and nextNumber

package java_programs;
public class fibonacci_series {
    public static void main(String[] args) {
        // set the initial number of elements
        int  maxNumber = 20;
        int previousNumber = 0;
        int nextNumber = 1;
            System.out.print("Fibonacci series of " + maxNumber + " numbers: ");
            for (int i=0; i<=maxNumber; ++i) {
                System.out.print(previousNumber + " ");

                int sum = previousNumber + nextNumber;
                previousNumber = nextNumber;
                nextNumber = sum;
            }
    }
}

// using while loop
class fibonacci_series_while_loop {
    public static void main(String[] args) {
        int maxNumber = 10;
        int previousNumber = 0;
        int nextNumber = 1;
            System.out.print("Fibonacci series of " + maxNumber + " numbers: ");
        int i=1;
        while (i<maxNumber) {
            System.out.print(previousNumber + " ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            i++;
        }
    }
}

// fibonacci series with user input
import java.util.Scanner;
class Fibonacci_user_input {
 
	public static void main(String[] args) 
	{
	
		 int maxNumber = 0; 
		 int previousNumber = 0;
		 int nextNumber = 1;
		 
		    System.out.println("How many numbers you want in Fibonacci:");
	        Scanner scanner = new Scanner(System.in);
	        maxNumber = scanner.nextInt();
	        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");
 
	        for (int i = 1; i <= maxNumber; ++i)
	        {
	            System.out.print(previousNumber+" ");
	            /* On each iteration, we are assigning second number
	             * to the first number and assigning the sum of last two
	             * numbers to the second number
	             */
 
	      
	            int sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;
	        }
	}
}

// using recursion 
class Fibonacci_with_recursion {
	public static int fibonacciRecursion(int n){
	if(n == 0){
		return 0;
	}
	if(n == 1 || n == 2){
			return 1;
		}
	return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
	}
    public static void main(String args[]) {
	int maxNumber = 10;
	System.out.print("Fibonacci Series of "+maxNumber+" numbers: ");
	for(int i = 0; i < maxNumber; i++){
			System.out.print(fibonacciRecursion(i) +" ");
		}
	}
}