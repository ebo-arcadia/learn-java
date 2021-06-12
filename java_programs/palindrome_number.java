// what is palindrome number?
// a number, when reversed, remains the same
// eg. 131 -> reversed -> 131

// program logic
// copy the number in a new variable
// reverse the new variable
// compare the two
// if the same, palindrome, if not, not palindrome

// solution 1 with while loop

package java_programs;
public class palindrome_number {
    public static void main(String[] args) {
        int lastDigit,sum=0,a;    
		int inputNumber=171; //It is the number  to be checked for palindrome 
 
		a=inputNumber; 
        
        // Code to reverse a number
		while(a>0)
		{   System.out.println("Input Number "+a);  
			lastDigit=a%10; //getting remainder  
			System.out.println("Last Digit "+lastDigit); 
			System.out.println("Digit "+lastDigit+ " was added to sum "+(sum*10)); 
			sum=(sum*10)+lastDigit;  
			a=a/10;
			
		}    
 
		// if given number equal to sum than number is palindrome otherwise not palindrome
		if(sum==inputNumber)    
			System.out.println("Number is palindrome ");    
		else    
			System.out.println("Number is not palindrome");
    }
}

// solution 2 - using for loop
class PalindromeNumForLoop {
 
	public static void main(String[] args)
	{
 
		int lastDigit,sum=0,a;    
		int inputNumber=185; //It is the number  to be checked for palindrome 
 
		a=inputNumber; 
        
        // Code to reverse a number
	for( ;a != 0; a /= 10 )
		{   System.out.println("Input Number "+a);  
			lastDigit=a%10; //getting remainder  
			System.out.println("Last Digit "+lastDigit); 
			System.out.println("Digit "+lastDigit+ " was added to sum "+(sum*10)); 
			sum=(sum*10)+lastDigit;  
			a=a/10;
			
		}    
 
		// if given number equal to sum than number is palindrome otherwise not palindrome
		if(sum==inputNumber)    
			System.out.println("Number is palindrome ");    
		else    
			System.out.println("Number is not palindrome");    
 
	}
 
}