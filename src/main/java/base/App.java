/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Alice Yu
 */
package base;
import java.util.Scanner;

/*
Exercise 10 - Self-Checkout
Working with multiple inputs and currency can introduce some tricky precision issues.

Create a simple self-checkout system. Prompt for the prices and quantities of three items.
Calculate the subtotal of the items.
Then calculate the tax using a tax rate of 5.5%.
Print out the line items with the quantity and total, and then print out the subtotal, tax amount, and total.

Example Output
Enter the price of item 1: 25
Enter the quantity of item 1: 2
Enter the price of item 2: 10
Enter the quantity of item 2: 1
Enter the price of item 3: 4
Enter the quantity of item 3: 1
Subtotal: $64.00
Tax: $3.52
Total: $67.52

Constraints
Keep the input, processing, and output parts of your program separate.
Collect the input, then do the math operations and string building, and then print out the output.
Be sure you explicitly convert input to numerical data before doing any calculations.

Challenges
Revise the program to ensure that prices and quantities are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
Alter the program so that an indeterminate number of items can be entered. The tax and total are computed when there are no more items to be entered.

 */

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        App myApp = new App();

        double price1 = myApp.readInput("Enter the price of item 1: ");
        double quantity1 = myApp.readInput("Enter the quantity of item 1: ");
        double price2 = myApp.readInput("Enter the price of item 2: ");
        double quantity2 = myApp.readInput("Enter the quantity of item 2: ");
        double price3 = myApp.readInput("Enter the price of item 3: ");
        double quantity3 = myApp.readInput("Enter the quantity of item 3: ");

        double total1 = price1 * quantity1;
        double total2 = price2 * quantity2;
        double total3 = price3 * quantity3;

        double subTotal = total1 + total2 + total3;
        double tax = subTotal * .055;
        double total = (subTotal + tax);

        String outputString = ("Subtotal: $" + String.format("%.2f", subTotal) + "\nTax: $" + String.format("%.2f", tax)
                + "\nTotal: $" + String.format("%.2f", total));
        myApp.printOutput(outputString);
    }

    public double readInput(String input)
    {
        System.out.print(input);
        String num = in.next();
        return Double.parseDouble(num);
    }

    public void printOutput(String input)
    {
        System.out.println(input);
    }
}
