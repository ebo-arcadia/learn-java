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

    void arrayOutOfBound(int x) {
        // int nums[] = new int[10];
        // java 8 >
        // int [] nums = IntStream.range(1,10).toArray();
        int nums[] = new int[] {1,2,3,4,5,6,7,8,9};

        if (nums[x] > nums.length) {
            throw new ArrayIndexOutOfBoundsException("array out of bound");
        }
        else {
            System.out.println("Value of element given entered index: " + nums[x]);
        }
    }

    public static void main(String args[]) throws IOException {
        ExceptionErrors ExpErrObj = new ExceptionErrors();
        ExpErrObj.arrayOutOfBound(100);
        try {
            ExpErrObj.compileException();
        }
        catch (IOException error) {
            System.out.print("There is an error:" + error + "\n");
            System.out.print("Error message is: " + error.getMessage() + "\n");
        }
        finally {
            ExpErrObj.arrayOutOfBound(9);
        }
    }
}