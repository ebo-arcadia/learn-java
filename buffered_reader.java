// java.io.Reader
// buffered reader: java class, read text from input, read request
// read() method
// passing file path to FileReaders

// example

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

class ReadFileExample {
    public static void main(String[] args) {
        BufferedReader objReader = null;
        try {
            String currentLineString;
            objReader = new BufferedReader(new FileReader("./FileForBuffered.txt"));
            while ((currentLineString = objReader.readLine()) != null) {
                System.out.println(currentLineString);
            }
        }   catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                try {
                    if (objReader != null)
                    objReader.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    class ReadFileExample_JDK7 {
        private static final String filename = "./FileForBuffered.txt";
        public static void main(String[] args) {
            try (BufferedReader readerObj = new BufferedReader(new FileReader(filename))) {
                String currentLineInString;
                while ((currentLineInString = readerObj.readLine()) != null) {
                    System.out.println(currentLineInString);
                }
             } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }