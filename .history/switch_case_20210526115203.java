// conditional statement
// activties only matching condition out of the given input 
// execute statement when case matches the input

class switchBoard {
    public static void main(String[] args) {
        int input = 2;
        switch(input) {
            case 0:
            System.out.println("Zero");
            break;
            case 1:
            System.out.println("One");
            break;
            case 2:
            System.out.println("Bingo!");
            break;
            default:
            System.out.println("Poor guy...");
        }
    }
}