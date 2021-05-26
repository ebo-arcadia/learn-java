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
            break; // run without the break and observe the outcome
            default:
            System.out.println("Not right...");
        }
    }
}

// break allows system to break out from the switch once statement is executed
// default statement get executed if no case matches input
