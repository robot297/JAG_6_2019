package week_5;

import java.util.LinkedList;

/**
 *
 * fixme
 *
 *  3.  Modify the wordCount method to return 0 if the sentence is null.
 
 *
 * This code crashes. Can you add exception handling to catch the error and print a message that the LinkedList is empty?

 */
public class Question_5_Add_Exception_Handling {

    public static void main(String[] args) {
        
        Question_5_Add_Exception_Handling q5 = new Question_5_Add_Exception_Handling();
        
        q5.printLanguageList();
        
        String sentence1 = "This is an example sentence.";
        String sentence2 = null;
        int words1 = q5.wordCount(sentence1);
        int words2 = q5.wordCount(sentence2);
    
        System.out.println(sentence1 + " has this many words: " + words1);
        System.out.println(sentence2 + " has this many words: " + words2);
        
    }
    
    public void printLanguageList() {
        
        // TODO stop this code crashing by adding exception handling to the method.
        // Don't modify any of the code - add a try-catch block to catch the exception that's thrown.
        // Your code should still print all the languages, but not crash.
        
        LinkedList languages = new LinkedList();
        
        languages.push("Python");
        languages.push("Swift");
        languages.push("C#");
    
        while (true) {
            String oneLanguage = (String) languages.pop();
            System.out.println(oneLanguage);
        }
        
    }
    
    
    /* A very simple word count function.
    Counting words can be a much trickier problem, with various special cases to consider. */
    
    public int wordCount(String sentence) {
        
        // TODO This code throws a NullPointerException if the String sentence is null.
        // Add a check to stop this code throwing a NullPointerException if sentence is null.
        //
        
        String[] words = sentence.split(" ");
        return words.length;
    }
    
    
    
}
