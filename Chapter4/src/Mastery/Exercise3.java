/*

Program:CollegeCalculator          		Date: 1/5/2026

Purpose:In small groups brainstorm all the expenses involved in attending a college or university (rent, tutition, books, etc) and possible offset costs (scholarships, etc). Create a CollegeCalculator application that
prompts the user for the amount of each expense and offset cost. If the cost is not applicable the user
should enter a value of 0. Add the expenses and subtract the offset costs to determine how much money
an individual will need for their school year. College websites can be used as a guide to determine
relevant and appropriate expenses.


Author: Tyson Ko
School: CHHS
Course: Computer Science 10
 

*/
package Mastery;

import java.util.Scanner;

public class Exercise3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // ----- EXPENSE INPUT -----
        System.out.println("Enter yearly expenses (enter 0 if not applicable).");

        System.out.print("Tuition: ");
        double tuition = input.nextDouble();

        System.out.print("Rent/Housing: ");
        double rent = input.nextDouble();

        System.out.print("Books and Supplies: ");
        double books = input.nextDouble();

        System.out.print("Food: ");
        double food = input.nextDouble();

        System.out.print("Transportation: ");
        double transport = input.nextDouble();

        System.out.print("Other expenses: ");
        double otherExpenses = input.nextDouble();

        // ----- OFFSET INPUT -----
        System.out.println("\nEnter yearly offsets (money that reduces cost). Enter 0 if none.");

        System.out.print("Scholarships: ");
        double scholarships = input.nextDouble();

        System.out.print("Grants: ");
        double grants = input.nextDouble();

        System.out.print("Family contributions / savings: ");
        double savings = input.nextDouble();

        System.out.print("Other offsets: ");
        double otherOffsets = input.nextDouble();

        // ----- CALCULATIONS -----
        double totalExpenses = tuition + rent + books + food + transport + otherExpenses;
        double totalOffsets = scholarships + grants + savings + otherOffsets;

        double totalNeeded = totalExpenses - totalOffsets;

        // ----- OUTPUT -----
        System.out.println("\nTotal yearly expenses: $" + totalExpenses);
        System.out.println("Total offsets: $" + totalOffsets);
        System.out.println("--------------------------------------------------");
        System.out.println("Total money needed for the school year: $" + totalNeeded);
    }
}

/* Screendump 

Enter yearly expenses (enter 0 if not applicable).
Tuition: 8000
Rent/Housing: 6000
Books and Supplies: 1200
Food: 2500
Transportation: 900
Other expenses: 600

Enter yearly offsets (money that reduces cost). Enter 0 if none.
Scholarships: 4000
Grants: 1000
Family contributions / savings: 2000
Other offsets: 0

Total yearly expenses: $19200.0
Total offsets: $7000.0
--------------------------------------------------
Total money needed for the school year: $12200.0

*/