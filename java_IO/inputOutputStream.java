// write a program to create a file, wrtie some byte data to it, and read it, print it in console back to the user

import java.io.*;

public class inputOutputStream {
    public static void readWriteFile() throws IOException {
        try {
            byte byteData[] = {1, 32, 15, 41, 87};
            OutputStream inFile = new FileOutputStream("fileToWrite.txt");
            for (int c = 0; c < byteData.length; c++) {
                inFile.write(byteData[c]); // write bytes into inFile
            }
            inFile.close();

            // read data from the file
            InputStream outFile = new FileInputStream("fileToWrite.txt");
            int byteSize = outFile.available();

            for (int c =0; c < byteSize; c ++) {
                System.out.print((char)outFile.read() + " ");
            }
            outFile.close();
        } catch (IOException error) {
            System.out.print(error);
        }
    }

    public static void main(String args[]) throws IOException {
        try {
            readWriteFile();
        } catch (IOException error) {
            System.out.print(error);
        }
    }
}