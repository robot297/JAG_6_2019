package week_5;

import com.google.common.base.Joiner;
import org.junit.Test;
import test_utils.PrintUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

/**
 * Created by Clara on 8/3/17.
 *
 */

public class Question_6_Fix_Code_No_Exception_HandlingTest {
    @Test
    public void printLanguageList() throws Exception {
        
        try {
    
            // Check that code still prints the same output
            Question_6_Fix_Code_No_Exception_Handling q6 = new Question_6_Fix_Code_No_Exception_Handling();
            PrintUtils.catchStandardOut();   // Catch the program's output
            q6.printLanguageList();
            String out = PrintUtils.resetStandardOut();   // And save it, to chck the program still prints the same data
            assertEquals("printLanguageList should still print the same 3 languages in the same order.", "C#\nPython\nJavaScript\n", out);
            
        } catch (NoSuchElementException e) {
    
            // Ensure code does not crash
            fail("Check if the languages LinkedList is empty before removing elements from it");
        }
        
    }
    
    @Test
    public void printLanguageListTryCatch() throws Exception {
        
        
        // Read source code and check that a try-catch statement has been added
        // Not something that would be done in a commercial test :)
        
        Joiner joiner = Joiner.on(System.getProperty("file.separator"));
        String path = joiner.join("src", "main", "java", "week_5", "Question_6_Fix_Code_No_Exception_Handling.java");
        BufferedReader reader = new BufferedReader(new FileReader(new File(path)));
        
        String line = reader.readLine();
        
        StringBuffer allLines = new StringBuffer();
        
        boolean inMethod = false;
        
        while (line != null) {
            
            if (line.contains("Start of printLanguageList.")) {
                inMethod = true;
            }
            
            if (line.contains("End of printLanguageList.")) {
                break;
            }
            
            
            if (inMethod) {
                allLines.append(line);
            }
            
            line = reader.readLine();
            
        }
        
        String allCode = allLines.toString();
        
        String pattern = "[\\S\\s]*catch.*\\(\\s*NoSuchElementException[\\S\\s]*";
        
        assertFalse("Don't use try-catch statements inside the printLanguageList method to catch the exception; fix the code so no exception is thrown",
                allCode.matches(pattern));
    }
    
    
    
    @Test
    public void wordCount() throws Exception {
        // Ensure code does not crash
        // Read source code to check for presence of try-catch block for the specific exception thrown
        
        try {
            Question_6_Fix_Code_No_Exception_Handling q6 = new Question_6_Fix_Code_No_Exception_Handling();
            int words = q6.wordCount("testing one two three");
            assertEquals("Make sure you don't change the behavior of wordCount. It should still count words.", 4, words);
            int nowords = q6.wordCount(null);
            assertEquals("wordCount should return 0 if sentence is null.", 0, nowords);
            
        } catch (NullPointerException npe) {
            fail("Check if the sentence is null before calling sentence.split()");
            
        }
        
    }
    
    
    @Test
    public void wordCountTryCatch() throws Exception {
        
        // Read source code and check that a try-catch statement has been added
        // Not something that would be done in a commercial test :)
        
        Joiner joiner = Joiner.on(System.getProperty("file.separator"));
        String path = joiner.join("src", "main", "java", "week_5", "Question_6_Fix_Code_No_Exception_Handling.java");
        BufferedReader reader = new BufferedReader(new FileReader(new File(path)));
        
        String line = reader.readLine();
        
        StringBuffer allLines = new StringBuffer();
        
        boolean inMethod = false;
        
        while (line != null) {
            
            if (line.contains("Start of wordCount.")) {
                inMethod = true;
            }
            
            if (line.contains("End of wordCount.")) {
                break;
            }
            
            if (inMethod) {
                allLines.append(line);
            }
            
            line = reader.readLine();
            
        }
        
        String allCode = allLines.toString();
        
        String pattern = "[\\S\\s]*catch.*\\(\\s*NullPointerException[\\S\\s]*";
        
        assertFalse("Check if the sentence is null before calling sentence.split(). Do not use try-catch statements",
                allCode.matches(pattern));
    }
    
    
    
}
    
