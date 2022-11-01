package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class handled {
    public static void main(String[] args) throws FileNotFoundException {

      //  readFile("myFile.txt");
      //  readFileV2("myFile2");


        try {
            int parseseResult = Integer.parseInt("abcd");
            System.out.println(parseseResult);
        } catch (NumberFormatException | NullPointerException nfe) {
            System.out.println("Incorret input - -should be a number");
        } finally {
            System.out.println("Finally block");
        }

    }

    // 1st var for handled exception
    public static void readFile(String filename) {
        try {
            FileReader fileReader = new FileReader(filename);
        } catch (FileNotFoundException fnfe) {
            System.out.println("Ooups, there is no such file");
        }
    }

    // 12nd var for handled exception
    public static void readFileV2(String filename) throws FileNotFoundException {
        FileReader fileReader = new FileReader(filename);
    }
}
