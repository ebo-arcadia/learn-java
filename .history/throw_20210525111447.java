import java.io.*;
class file1{
  public static void main(String[] args) {
     try{
           FileWriter file = new FileWriter("c:\\Data1.txt");
           file.write("Guru99");
           file.close();
    }
    catch(IOException){}
  }
}

// downside of using try and catch for all exceptions?
// cumbersome -> option?
// declare throw when using risky code
