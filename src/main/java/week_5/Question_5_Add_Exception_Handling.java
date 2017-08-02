package week_5;

import java.util.LinkedList;

/**
 *
 * fixme
 *
 *
 * This code crashes. Can you add exception handling to catch the error and print a message that the LinkedList is empty?

 */
public class Question_5_Add_Exception_Handling {

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
