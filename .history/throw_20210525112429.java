import java.io.*;
class file0{
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

class file1{
    public static void main(String[] args) throws IOException{
      FileWriter file = new FileWriter("c:\\Data1.txt");
      file.write("Guru99");
      file.close();
    }
}

// two ways to handle exception
// put it in try and catch 
// or declare throw exception in method

// throw vs throws 
// throw -> create new throw exception obj and throw it -> declare one exception at a time
// throws-> used in method declare a risky code is used -> declare multiple exceptions

// throw new IOException("Can not connect")
// throws IOException

