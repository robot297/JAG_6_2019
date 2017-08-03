package week_5;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 *
 
 This program has two example methods. Both throw exceptions.
 
 Fix by adding a try-catch block in each method.  Don't modify any of the existing code. Here, you will be adding new code.
 
 For the printLanguageList method, add try-catch statements. In the catch block, print a message that the LinkedList is empty.
 
 For the wordCount method, add try-catch statements so a NullPointerException is not thrown if the sentence is null. If the sentence is null, return 0.
 
 */
public class Question_5_Add_Exception_Handling {

    public static void main(String[] args) {
        
        Question_5_Add_Exception_Handling q5 = new Question_5_Add_Exception_Handling();
        
        // Test the printLanguageList() method
        q5.printLanguageList();
        
        // Test the wordCount() method
        String sentence1 = "This is an example sentence.";
        String sentence2 = null;
        int words1 = q5.wordCount(sentence1);
        int words2 = q5.wordCount(sentence2);
    
        System.out.println(sentence1 + " has this many words: " + words1);
        System.out.println(sentence2 + " has this many words: " + words2);
        
    }
    
    /* Adds some example programming languages to a LinkedList, and then prints them in reverse order.
     */
    
    //Start of printLanguageList. Don't change or move this comment
    
    public void printLanguageList() {
        
        // TODO stop this code crashing by adding exception handling to the method.
        // Don't modify any of the code or change what is printed.
        // Add a try-catch block to catch the exception that's thrown.
        // Your code should still print all the languages, but not crash.
        
        LinkedList<String> languages = new LinkedList<String>();
        
        languages.push("Python");
        languages.push("Swift");
        languages.push("C#");
    
        while (true) {
            String oneLanguage = languages.pop();
            System.out.println(oneLanguage);
        }
    }
    
    //End of printLanguageList. Don't change or move this comment
    
    
    /* A very simple word count function.
    
    This function should return the number of words in a string.
    For this program, each word is assumed to be separated by a single space character.
    If the String sentence is null, this method should return 0.
    
    Counting words can be a much trickier problem, with various special cases to consider. */
    
    //Start of wordCount. Don't change or move this comment
    
    public int wordCount(String sentence) {
    
        // TODO This code throws a NullPointerException if the String sentence is null.
        // Add a try-catch block to catch the NullPointerException, so and return 0 if the String sentance is null.
        // Don't modify any of the code that's here already.
    
        String[] words = sentence.split(" ");
        return words.length;
    }
    
    //End of wordCount. Don't change or move this comment
    
    
}
