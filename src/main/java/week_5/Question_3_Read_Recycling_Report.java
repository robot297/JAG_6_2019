package week_5;

import java.io.IOException;
import java.util.ArrayList;

/**
 
 There is a file called recycling-report-main-street.txt in the root
 directory of this project.
 
 This file contains data for a much longer street. Again, the house numbers correspond to array or ArrayList indexes.
 Read it into your program, analyze the data, and then display the numbers of the house(s) that recycled the most crates?
 
 Make sure you use try-catch blocks for IOException.
 
 */

public class Question_3_Read_Recycling_Report {
    
    String filename = "recycling-report-main-street.txt";
    
    public static void main(String[] args) {
        new Question_3_Read_Recycling_Report().recyclingReport();
    }
    
    public void recyclingReport(){
        
        // Read the file into
        
        ArrayList<String> lines = readLinesFromRecyclingDataFile(filename);
        ArrayList<Integer> crateQuantities = extractCrateQuantityData(lines);
        int max = calculateMax(crateQuantities);
        ArrayList<Integer> housesWithMax = copyIndexesToNewArrayList(crateQuantities, max);
    
        System.out.println("The maximum number of crates is " + max);
        System.out.println("The houses with this max number of crates is " + housesWithMax);
    }
    
    
    public ArrayList<String> readLinesFromRecyclingDataFile(String filename) {
        
        // TODO read the lines of the file, given by filename, into an ArrayList.
        // Don't modify the lines. Each element in the ArrayList is one line from the file.
        // Return the ArrayList.
        
       return null;
    }
    
    
    public ArrayList<Integer> extractCrateQuantityData(ArrayList<String> lines) {
        
        //TODO extract the number of crates from each String,
        // convert to an integer, and save each integer in a new ArrayList
        
        return null;
    
    }
    
    
    public int calculateMax(ArrayList<Integer> crates) {
    
        // TODO calculate the largest value in the crates ArrayList, and return it
        // Example: if the ArrayList contains [ 9, 3, 2, 5, 9, 0 ], you should return 9.
        
        // Make this method general, so it works for any set of numbers.
        // If the ArrayList contains [-9, -4, -2, -10] this function should return -2.
        
        return 0;
    }
    
    
    public ArrayList<Integer> copyIndexesToNewArrayList(ArrayList<Integer> quantities, int value) {
    
        //TODO copy the indexes of the houses with this maximum number into a new ArrayList and return this.
        
        // This should be a generic method to copy all of the indexes of an ArrayList
        // where the element holds a certain value; into a new ArrayList.
        // Exmple: if the ArrayList contains [ 9, 3, 2, 5, 9, 0 ]
        // The maximum values, 9, is found at index 0 and 5
        // So return a new ArrayList [ 0, 5 ]
        
        return null;
    
    }
    
}
