/*

Program:ObjectHeight          		Date: 1/5/2026

Purpose:The height of an object at any given time dropped from a starting height of 100 meters is given by the
equation h=100–4.9*t2 where t is the time in seconds. Create an ObjectHeight application that prompts
the user for a time less than 4.5 seconds and then displays the height of the object at that time.


Author: Tyson Ko
School: CHHS
Course: Computer Science 10
 

*/
package Mastery;


import java.util.Scanner;

public class Exercise1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a time less than 4.5 seconds: ");
        double t = input.nextDouble();

        double h = 100 - 4.9 * t * t;

        System.out.println("The height of the object is: " + h + " meters");
    }
}

/* Screendump 

Enter a time less than 4.5 seconds: 2
The height of the object is: 80.4 meters

*/