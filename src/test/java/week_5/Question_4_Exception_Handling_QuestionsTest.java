package week_5;

import org.junit.Test;

import static org.junit.Assert.*;


public class Question_4_Exception_Handling_QuestionsTest {
    
    @Test
    public void checkAnswerFilledIn() throws Exception {
        
        // All this does is test that the student wrote at least something.
        
        // The actual grades for this will assessed by the instructor.
        
        Question_4_Exception_Handling_Questions q4 = new Question_4_Exception_Handling_Questions();
        
        assertTrue("Answer question 1, ", q4.q1_pros_of_checked_exceptions.length() > 15);
        assertTrue("Answer question 2, ", q4.q2_cons_of_checked_exceptions.length() > 15);
        assertTrue("Answer question 3, ", q4.q3_your_opinion_on_java_having_checked_and_unchecked_exceptions.length() > 15);
        
        for (String answer : q4.q4_why_is_it_better_to_anticipate_and_prevent_errors) {
            assertTrue("Answer question 4, ", answer.length() > 15);
        }
    }
    
}