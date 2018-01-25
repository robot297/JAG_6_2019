package week_5;


import java.io.*;

/**
 *
 Write a program that uses the buffered classes to write out
 - your name
 - your favorite color
 - this class's code (2545)

 to a new file, with one item per line.

 Now, read in all of the data, line by line, and display it.

 *
 */


public class Question_1_Write_Name_Color_Class_Code {
    
    public static void main(String[] args) {
        new Question_1_Write_Name_Color_Class_Code().fileIO();
    }

    public void fileIO() {

        String filename = "data.txt";

        String name = "";  //TODO fill in your name
        String favoriteColor = ""; //TODO fill in your favorite color
        int classCode = 2545;

        writeToFile(filename, name, favoriteColor, classCode);

        printDataFromFile(filename);

    }


    public void writeToFile(String filename, String name, String favoriteColor, int classCode) {

        // TODO write the three pieces of information to the file given by filename.
        // TODO Add try-catch blocks to this method. This method should NOT declare that it throws IOException or any other file exceptions.
        
    }


    public void printDataFromFile(String filename) {

        // TODO read in the data from the file, and print it.
        // TODO Add try-catch blocks to this method. This method should NOT declare that it throws IOException or any other file exceptions.
        
    }
}
