import java.io.*;

// key concepts:
// streams
// java io package
// File input and out stream classes
// what data types it support? primitives, objects, localized variables
// directories: a File object contains a list of directories and files

public class FileIO {

    // java byte stream code example (perform input and output 8-bit bytes)
    // write a program to write content in file 1 to file 2 using FileInputStream and FileOutputStream classes
    public static void CopyFileByteStream() throws IOException {
        FileInputStream fileInputStreamObj = null;
        FileOutputStream fileOutputStreamObj = null;

        try {
            fileInputStreamObj = new FileInputStream("copyFromInputFile.txt");
            fileOutputStreamObj = new FileOutputStream("pasteToOutputFile.txt");

            int content;
            while ((content = fileInputStreamObj.read()) != -1) {
                fileOutputStreamObj.write(content);
            }
        } finally {
            if (fileInputStreamObj != null) {
                fileInputStreamObj.close();
            }
            if (fileOutputStreamObj != null) {
                fileOutputStreamObj.close();
            }
        }
    }

    // java character stream code example (using FileReader & FileWriter to read & write 16-bit unicode)
    // FileReader & FileWriter classes use FileInputScream & FileOutputStream classes but read & write 2 bytes at the same time
    public static void CopyFileCharStream() throws IOException {
        FileReader inFile = null;
        FileWriter outFile = null;

        try {
            inFile = new FileReader("inFileCharStream.txt");
            outFile = new FileWriter("outFileCharStream.txt");

            int contentToCopy;
            while ((contentToCopy = inFile.read()) != -1) {
                outFile.write(contentToCopy);
//                timeout(3000);
            }
        } finally {
            if (inFile != null) {
                inFile.close();
            }
            if (outFile != null) {
                outFile.close();
            }
        }
    }

    public static void main(String args[]) throws IOException {
        try {
            CopyFileByteStream();
            CopyFileCharStream();
        }
        catch (IOException error){
            System.out.print(error);
        }

        // how to compare runtime of two operations?
        // difference between double/single quote?
    }
}