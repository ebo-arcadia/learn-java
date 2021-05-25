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
// syntax
// method (args) throw exception 1, exception 2,... {}

import java.io.*;
class file1{
    public static void main(String[] args) throws IOException{
      FileWriter file = new FileWriter("c:\\Data1.txt");
      file.write("Guru99");
      file.close();
    }
}

