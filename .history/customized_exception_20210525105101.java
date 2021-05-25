// available exception
// getLocalizedMessage()
// getMessage()
// toString()

class userException {
    public static void main(String[] args) {
        try{
            throw new MyException(2);
            // keyword throw is used to create a new exception and throw it
        }
        catch(MyException e) {
            System.out.println(e);
        }
    }
}

class MyException extends Exception {
    int x;
    MyException(int z) {
        x = z;
    }
    public String toString() {
        return ("Exception Number = " + x);
    }
}