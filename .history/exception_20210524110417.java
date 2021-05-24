// event interrupts program flow
// object wraps error even info 
// error occurs in method
// error is sent to run time system
// used to indicate types of errors

// compile time errors => syntax errors & semantic errors (declare var twice)
// runtime errors => server is down during production run time but code is fine

// why exception?
// how to handle exception?

// exception handler

// class connect {
//     if(server Up) {
//         // code to connect to server
//     }
//     else {
//         // code to connect to backup server
//     }
// }

// the above is not effective when multiple exceptions
// java inbuilt exception handing
// syntax

// try {
//     statements(s)
// }
// catch (exception type name) {
//     statements(s)
// }

// exception handling example

// class JavaException {
//     public static void main(String args[]) {
//         int x = 0;
//         int z = 100;
//         try {
//             int fraction = z/x;
//             System.out.println("This line will not be executed");
//         } catch (ArithmeticException e) {
//             System.out.println("In catch block due to exception = " + e);
//         }
//         System.out.println("End of main");
//     }
// }

// java exception class hierarchy
// throwable => Error ( not normal -> JVM error, memory error, hardware error) & Exception (can be handled)

// example program of nesting of try and catch blocks 

class nestedJavaException {
    public static void main(String[] args) {
        try {
            int a = 1;
            int b = 10;
            int fraction = b/a;
            int c[] = { 1 };
            c[10] = 99;
        }
        catch(Exception e) {
            System.out.println("In this catch block due to exception = " + e);
        }
        catch(ArithmeticException e) {
            System.out.println("In this catch block due to exception = " + e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("In this catch block due to exception = " + e);
        }
        System.out.println("End of Main");
    }
}

// Exception is the base class of all exception errors thus can handle all exceptions 

// java final block