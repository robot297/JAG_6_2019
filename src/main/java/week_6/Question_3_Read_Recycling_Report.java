package week_6;

import java.util.List;

/**
 
 There is a file called recycling-report-main-street.txt in the root
 directory of this project.
 
 This file contains data for a much longer street. Again, the house numbers correspond to array or ArrayList indexes.
 Read it into your program, analyze the data, and then display the numbers of the house(s) that recycled the most crates
 
 Make sure you use try-catch blocks for IOException.
 
 */

public class Question_3_Read_Recycling_Report {
    
    
    public static void main(String[] args) {
        new Question_3_Read_Recycling_Report().recyclingReport();
    }
    
    public void recyclingReport(){
        
        // Read the file into your program
        String filename = "recycling-report-main-street.txt";
    
        List<String> lines = readLinesFromRecyclingDataFile(filename);
        List<Integer> crateQuantities = extractCrateQuantityData(lines);
        int max = calculateMax(crateQuantities);
        List<Integer> housesWithMax = copyIndexesToNewList(crateQuantities, max);
    
        System.out.println("The maximum number of crates is " + max);
        System.out.println("The houses with this max number of crates is " + housesWithMax);
    }
    
    
    public List<String> readLinesFromRecyclingDataFile(String filename) {
        // TODO read the lines of the file, given by filename, into an ArrayList.
        // Don't modify the lines. Each element in the ArrayList is one line from the file.
        // Return the ArrayList.
        // Add exception handling to this method. Print an error message and return null if an exception is thrown.
        
       return null;  // TODO return your ArrayList of lines
    }
    
    
    public List<Integer> extractCrateQuantityData(List<String> lines) {
        //TODO extract the number of crates from each String,
        // convert to an integer, and save each integer in a new ArrayList
        
        return null;  // TODO return your ArrayList of crate quantities
    }
    
    
    public int calculateMax(List<Integer> crates) {
    
        // TODO calculate the largest value in the crates ArrayList, and return it
        // Example: if the ArrayList contains [ 9, 3, 2, 5, 9, 0 ], you should return 9.
        
        // Make this method general, so it works for any set of numbers.
        // If the ArrayList contains [-9, -4, -2, -10] this function should return -2.
        
        return 0;   // TODO replace with your code.
    }
    
    
    public List<Integer> copyIndexesToNewList(List<Integer> quantities, int value) {
    
        //TODO finish this method.
        
        // This should be a generic method to write all of the indexes of an ArrayList
        // where the element holds a certain value; into a new ArrayList.
        // Example: if the ArrayList contains [ 9, 3, 2, 5, 3, 0 ] and value is 3
        // The value, 3, is found at index 1 and 4.
        // So create and return a new ArrayList that contains [ 1, 4 ]
        
        return null;   // TODO delete and replace with your code.
    }
    
}