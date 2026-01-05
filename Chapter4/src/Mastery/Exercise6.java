/*

Program:Change          		Date: 1/5/2026

Purpose:Create a Change application that prompts the user for an amount less than $1.00 and then displays the minimum number of coins necessary to make the change. 
The change can be made up of quarters, dimes, nickels, and pennies.


Author: Tyson Ko
School: CHHS
Course: Computer Science 10
 

*/
package Mastery;

import java.util.Scanner;

public class Exercise6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Ask user for the amount of change in cents
        System.out.print("Enter the change in cents: ");
        int cents = input.nextInt();

        // Calculate coins
        int quarters = cents / 25;
        cents = cents % 25;

        int dimes = cents / 10;
        cents = cents % 10;

        int nickels = cents / 5;
        cents = cents % 5;

        int pennies = cents;

        // Output results
        System.out.println("The minimum number of coins is:");
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
    }
}

/* Screendump 

Enter the change in cents: 97
The minimum number of coins is:
Quarters: 3
Dimes: 2
Nickels: 0
Pennies: 2

*/
