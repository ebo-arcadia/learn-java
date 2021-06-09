package java_programs;

class primeNumberFounder {
    public static void main(String[] args) {
        int i;
        int num = 0;
        int maxCheck = 100;
        boolean isPrime = true;

        String primeNumberList = "";
    
        for (i = 2; i < maxCheck; i++) {
            isPrime = CheckPrime(i);
            if (isPrime) {
                primeNumberList = primeNumberList + i + " ";
            }
        }
        System.out.println("Prime number from 1 to " + maxCheck + "are: ");
        System.out.println(primeNumberList);
    }
    public static boolean CheckPrime(int numberToCheck) {
        int remainer;
        for (int i = 2; i < numberToCheck / 2; i++) {
            remainer = numberToCheck % i;
            if (remainer == 0) {
                return false;
            }
        }
        return true;
    }
}