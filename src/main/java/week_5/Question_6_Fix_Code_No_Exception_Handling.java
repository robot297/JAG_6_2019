package week_5;

import java.util.LinkedList;

/**
 
 This question uses the same code as Question 5 in Question_5_Add_Exception_Handling.java

 Instead of waiting for an exception and catching, it is usually better to try and prevent problems.

 Can you think of a better way to stop this code crashing?
 
 Modify the printLanguageList and wordCount methods program so that the program runs correctly without using a try-catch block.


 */
public class Question_6_Fix_Code_No_Exception_Handling {
    
    public static void main(String[] args) {
        
        Question_6_Fix_Code_No_Exception_Handling q6 = new Question_6_Fix_Code_No_Exception_Handling();
        
        // Test the printLanguageList() method
        q6.printLanguageList();
        
        // Test the wordCount() method
        String sentence1 = "This is an example sentence.";
        String sentence2 = null;
        int words1 = q6.wordCount(sentence1);
        int words2 = q6.wordCount(sentence2);
        
        System.out.println(sentence1 + " has this many words: " + words1);
        System.out.println(sentence2 + " has this many words: " + words2);
        
    }
    
    /* Adds some example programming languages to a LinkedList, and then prints them in reverse order.
     */
    
    //Start of printLanguageList. Don't change or move this comment. The autograder needs it
    
    public void printLanguageList() {
        
        // TODO stop this code crashing by modifying it
        // to check for possible errors before they happen.
        // Make sure you still print all of the languages from the list.
        
        LinkedList<String> languages = new LinkedList<String>();
        
        languages.push("JavaScript");
        languages.push("Python");
        languages.push("C#");
        
        while (true) {
            String oneLanguage = languages.pop();
            System.out.println(oneLanguage);
        }
    }
    
    //Start of printLanguageList. Don't change or move this comment. The Autograder needs it
   
    
    /* A very simple word count function.
    
    This function should return the number of words in a string.
    For this program, each word is assumed to be separated by a single space character.
    If the String sentence is null, this method should return 0.
    
    Counting words can be a much trickier problem, with various special cases to consider. */
    
    //Start of wordCount. Don't change or move this comment, the autograder needs it
    
    public int wordCount(String sentence) {
        
        // TODO This code throws a NullPointerException if the String sentence is null.
        // Modify this code to test if the String is null before splitting it.
        // Return 0 if the String is null.
        String[] words = sentence.split(" ");
        return words.length;
    }
    
    //End of wordCount. Don't change or move this comment, the Autograder needs it
    
}
    