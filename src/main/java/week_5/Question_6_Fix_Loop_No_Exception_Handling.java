package week_5;

import java.util.LinkedList;

/**


 fixme


 This is the same code as Q5.

 Instead of waiting for an exception and catching, it is usually better to try and prevent problems.

 Can you think of a better way to stop this code crashing? Modify this program so that it runs correctly without using a try-catch block.

 Please paste your Java code here:

 */
public class Question_6_Fix_Loop_No_Exception_Handling {

    public static void main(String[] args) {


        LinkedList languages = new LinkedList();
        languages.push("Python");
        languages.push("Java");
        languages.push("C#");

        while (true) {
            String oneLanguage = (String)languages.pop();
            System.out.println(oneLanguage);

        }



    }



}
