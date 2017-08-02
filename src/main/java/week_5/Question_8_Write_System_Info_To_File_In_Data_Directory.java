package week_5;

/**
 *
 *
 *
 * fixme
 *
 *

 Write a program that writes the OS name, OS version, OS architecture, and user
 account name to a file, without hard coding any of these things.  Test your program on a Windows and Mac computer. There are Macs and PC computers in the hallway outside T3050.


 Problem 2:  All of the code so far has assumed that we are working with a file in the root directory of your project.  But, a file could be anywhere on your system, so Java needs to support reading files anywhere on your computer (and even on remote computers).  Perhaps your program needs several data files, and it would be nice to organize them into one /data directory in your project directory.

 Create a /data/ directory in your project directory. Write a program that creates and stores a test file in this directory.

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



 Problem 3: Java is architecture-neutral and the same code is supposed to run in the same way on PC and Mac and Linux, and anything else a JVM can be installed on, like a TV, Android device, refrigerator, car, toaster...

 Until we got to files, all of our code will run the same on any device, and we'd like to maintain that as we work with files.

 How can your code know what operating system it is running on, and specify files with backslash or forward slashes?

 This does need a little work on the part of the programmer to help code run correctly on different platforms.  How would this help?

 http://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html

 Can you re-write your code above using system properties, so it will run on Windows and Mac?

 Test your program on a Windows and Mac computer. There are Macs and PCs in the hallway outside T3050.

 Paste your Java program here:

 Make sure you catch and handle any exceptions.

 Paste your Java program here:

 */
public class Question_8_Write_System_Info_To_File_In_Data_Directory {
}
