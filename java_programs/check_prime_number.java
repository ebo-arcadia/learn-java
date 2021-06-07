// what is a prime number?
// a number only divisible by 1 or itself
// 0 and 1 are not prime number
// 2 is the only even prime number

// write a program to check if a number is a prime
// program logic

// divide a number by 2, if remainder is 0, number is not a prime
// no number is divisible by more than half of itself
// if number is prime, set isPrime to true and exit loop
// if number is not prime, set isPrime to false and exit loop

class primeNumberChecker {
    public static void main(String[] args) {
        int remainder;
        boolean isPrime = true;
        int numberToCheck = 19;

        for (int i=2; i<numberToCheck/2; i++) {
            remainder = numberToCheck/i;
            System.out.println(numberToCheck + "Divided by " + i + " gives a reminder of " + remainder);

            if (remainder == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println(numberToCheck + " is a prime number");
        else
        System.out.println(numberToCheck + " is NOT a prime number");
    }
}

class PrimenumberToCheckCheck {
 
    public static void main(String[] args) {
     int remainder;
     boolean isPrime=true;
     int numberToCheck=17; // Enter the numberToCheckber you want to check for prime
           
     //Loop to check whether the numberToCheckber is divisible any numberToCheckber other than 1 and iteself
     for(int i=2;i<=numberToCheck/2;i++)
     {
      //numberToCheckber is dived by itself
               remainder=numberToCheck%i;
               System.out.println(numberToCheck+" Divided by "+ i + " gives a remainder "+remainder);
               
          //if remainder is 0 than numberToCheckber is not prime and break loop. Elese continue loop
        if(remainder==0)
        {
           isPrime=false;
           break;
        }
     }
     // Check value true or false,if isprime is true then numberToCheckber is prime otherwise not prime
     if(isPrime)
        System.out.println(numberToCheck + " is a Prime numberToCheckber");
     else
        System.out.println(numberToCheck + " is not a Prime numberToCheckber");
       }
     }
   