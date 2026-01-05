/*

Program:PizzaCost          		Date: 1/5/2026

Purpose:The cost of making a pizza at a local shop is as follows:
• Labor cost is $0.75 per pizza, regardless of size
• Rent cost is $1.00 per pizza, regardless of size
• Materials is $0.05*diameter*diameter (diameter is measured in inches)
Create a PizzaCost application that prompts the user for the size of a pizza and then displays the cost
of making the pizza.


Author: Tyson Ko
School: CHHS
Course: Computer Science 10
 

*/
package Mastery;

import java.util.Scanner;

public class Exercise2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Prompt user for pizza diameter
        System.out.print("Enter the diameter of the pizza in inches: ");
        double diameter = input.nextDouble();

        // Costs
        double laborCost = 0.75;
        double rentCost = 1.00;
        double materialsCost = 0.05 * diameter * diameter;

        // Total cost
        double totalCost = laborCost + rentCost + materialsCost;

        // Display result
        System.out.println("The cost of making the pizza is: $" + totalCost);
    }
}

/* Screendump 

Enter the diameter of the pizza in inches: 10
The cost of making the pizza is: $6.75

*/