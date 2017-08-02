package week_5;

/**
 *
 *
 *
 * fixme
 *
 *
 Problem 1:
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

 */
public class Question_7_Coffee_Shop {
}
