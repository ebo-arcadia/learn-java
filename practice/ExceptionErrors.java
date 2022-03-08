// what is exception or exceptional event? errors
// when does it occur? when the compiler is trying to compile or at runtime
// what are the common exceptional errors? invalid input; logic errors; network; stack overflow
// who causes errors? programmer; user; system
// how to implement code handling multiple errors?
// how to implement custimized exception handlers using extend feature from native exception class?

import java.io.*;

public class ExceptionErrors {

    void compileException() throws IOException {
        File file = new File("/tmp");
        FileReader fileObj = new FileReader(file);
    }

    void arrayOutOfBound(int x) throws IOException {
        int nums[] = new int[10];
        if (nums[x] <= nums.length) {
            System.out.println("Value of element given entered index: " + nums[x]);
        }
        else {
            throw new IOException("array out of bound");
        }
    }

    public static void main(String args[]) throws IOException {
        System.out.print("/n----------------/n");
        ExceptionErrors ExpErrObj = new ExceptionErrors();
        try {
            ExpErrObj.compileException();
            ExpErrObj.arrayOutOfBound(11);
        }
        catch (IOException error) {
            System.out.print("There is an error:" + error + "\n");
            System.out.print("Error message is: " + error.getMessage() + "\n");
        }
        catch (ArrayIndexOutOfBoundsException error) {
            System.out.print("There is an error:" + error + "\n");
            System.out.print("Error message is: " + error.getMessage() + "\n");
        }
        finally {
            ExpErrObj.arrayOutOfBound(2);
        }
    }
}