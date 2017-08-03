# Lab 4

### Question 1 

Write a program that uses the buffered classes to write out your name, your favorite color, and this class's code (2545) to a new file.   
Write one item per line.

Now, read in all of the data, line by line, and display it.

Add try-catch blocks for IOException to the writing code, and the reading code. Recommended to use the try-with-resources version.

### Question 2 Write Recycling Report
    
Start with your recycling truck program from last week. Add code so that it writes the data as a report to a file. The report file will look something like this example,

```
House 0 recycled 1 crate
House 1 recycled 2 crates
House 2 recycled 1 crate
House 3 recycled 2 crates
House 4 recycled 3 crates
House 5 recycled 3 crates
House 6 recycled 2 crates
House 7 recycled 1 crate

Total crates recycled: 15

```

Use try-catch blocks for IOException. The try-with-resources version is recommended.


### Question 3 Read Recycling Report


There is a file called recycling-report-main-street.txt in the root 
 directory of this project. 
 
 This file contains data for a much longer street. Again, the house numbers correspond to array or ArrayList indexes.
 Read it into your program, analyze the data, and then display the numbers of the house(s) that recycled the most crates?
 
 Make sure you use try-catch blocks for IOException.
 

### Question 4 Exception Handling

Question: Java doesn't make you deal with possible NullPointerException, or ArrayIndexOutOfBoundsException. 
These are called unchecked exceptions. 

So, why does Java insist that you deal with IOException – a checked exception - in some way?   

Java's checked vs. unchecked exceptions are unusual and questions on this subject are common in Java job interviews!


### Question 5 Fix Loop with Exception Handling

This code crashes. Can you add exception handling to catch the error and print a message that the 
LinkedList is empty?

        LinkedList languages = new LinkedList();
        languages.push("Python");
        languages.push("Java");
        languages.push("C#");

        while (true) {
            String oneLanguage = (String)languages.pop();
            System.out.println(oneLanguage);

        }

        System.out.println("The list is empty")

Question: what data structure is LinkedList behaving as in this code? Hint: what are push() 
and pop() used with?

  
### Question 6 Fix Loop, No Exception Handling


Instead of waiting for an exception and catching, it is usually better to try and prevent problems.

Can you think of a better way to stop this code crashing? Modify this program so that it runs 
correctly without using a try-catch block.

### Question 7 Coffee Shop

Write a program that creates a sales report for a coffee shop. The coffee shop will use this at the end of every day to calculate sales, expenses, and profit.
The coffee shop sells 12 different drinks. The name of each drink, the price the shop charges the customer, and how much it costs to make each drink, are saved in the file coffee.txt, which you'll find in the Assignments section. The data is in the format

name;cost to make;price charged
As in this example,
cappuccino;1.56;3.50

So the cappuccino drink costs the coffee shop $1.56 to make, and they charge the customer $3.50.
Your program should read this data from coffee.txt, and store it in some kind of data structure.
Next, your program should ask the user how many of each drink were sold today. So, it might ask "How many cappuccino drinks were sold today?" and the user can type in a number. It will need to ask for each drink individually. You'll need to store this data somehow.
You should add input validation so that if the user enters "ten" or "10.4" or -45 then your program will respond appropriately.  You should also deal with any file-related exceptions properly.
Once you have gathered all the data, generate a report that will be written out to a new file called sales-report.txt. For each drink, record the number of drinks sold, the total that it cost to make those drinks (expenses), and the total amount (revenue) spent by customers on that drink. So, for example, if the coffee shop sold 10 cappuccinos today, you'll write a line that says
Cappuccino: Sold 10, Expenses $15.60, Revenue $35.00, Profit $19.40
Your output file should have a similar line for each of the drinks.
At the bottom of the file, write the total expenses, total revenue, and total profit for all drinks.
You should use try-with-resources exception handling for both file reading, and file writing.
Use methods to organize your code.
Test and comment your code.

### Question 8 Write to Another Directory

All of the code so far has assumed that we are working with a file in the root directory of your project.  But, a file could be anywhere on your system, so Java needs to support reading files anywhere on your computer (and even on remote computers).  Perhaps your program needs several data files, and it would be nice to organize them into one /data directory in your project directory.

There's a /data/ directory in the root of this project. Write a program that creates and stores a test file in this directory.

FileWriter can take a filename as an argument. The filename can only be a file in your current directory. So you can’t say

new FileWriter fw = new FileWriter(“/data/testing.txt”);

But, FileWriter can also take a File object as an argument, and a File object can store a path to a file elsewhere on your system (or even on a remote system).

Here’s how to create a File object;

File f = new File(“/mydirectory/mysubdirectory/textfile.txt”);

Assuming these directories exist, you can create and write that file in this location.  The location is relative to the current directory.  I’ll leave it to you to put these pieces together.

Notice that one file system uses forward slashes, and one uses backslashes, so you'll need to use the correct \ or / for your computer.  Mac is also case-sensitive.


[Note: It is possible, but not recommended, to use absolute pathnames, for example

C:\program files\java\textfile.txt on Windows, or
/users/admin/Documents/textfile.txt on a Unix-based system like Linux or Mac,

but if you do that, your program will most likely not work on anyone else's computer! ]


Make sure you catch and handle any exceptions.


### Question 9 Architecture Neutral Code

Java is architecture-neutral and the same code is supposed to run in the same way on PC and Mac and Linux, and anything else a JVM can be installed on, like a TV, Android device, refrigerator, car, toaster...

Until we got to files, all of our code will run the same on any device, and we'd like to maintain that as we work with files.

How can your code know what operating system it is running on, and specify files with backslash or forward slashes?

This does need a little work on the part of the programmer to help code run correctly on different platforms.  How would this help?

http://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html

Can you re-write your code above using system properties, so it will run on Windows and Mac?

Test your program on a Windows and Mac computer. There are Macs and PCs in the hallway outside T3050.


Write a program that writes the OS name, OS version, OS architecture, and user account name to a file, without hard coding any of these things.  Test your program on a Windows and Mac computer. There are Macs and PC computers in the hallway outside T3050.



And, please paste a screenshot of your program's output on each platform here:

Mac: Command+Shift+Control+4, drag the crosshairs over the desired area of screen to copy a screenshot to the clipboard. Return to word, press Command+V to paste the screenshot.

PC: in Word's menu, there's an Insert screenshot option, look for the Screen Clipping option.
