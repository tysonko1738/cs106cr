/*

Program:Bingo Card          		Date: 12/18/2025

Purpose:Create a BingoCard application that displays a traditional bingo card with five columns of five unique
numbers. The column labels are B, I, N, G, and O. Column B contains numbers ranging from 1 through
15, column I has numbers ranging from 16 through 30, column N has four numbers ranging from 31
through 45 and a Free Space in the middle of the column, column G has numbers ranging from 46
through 60, and column O has numbers ranging from 61 through 75. 


Author: Tyson Ko
School: CHHS
Course: Computer Science 10
 

*/

package Mastery;

public class Exercise1 

{
    public static void main(String[] args) 
    {

        // Print the column headers
        System.out.println(" B   I   N   G   O");

        // Row 1
        System.out.printf("%2d  %2d  %2d  %2d  %2d\n",
                getNumber(1, 15),
                getNumber(16, 30),
                getNumber(31, 45),
                getNumber(46, 60),
                getNumber(61, 75));

        // Row 2
        System.out.printf("%2d  %2d  %2d  %2d  %2d\n",
                getNumber(1, 15),
                getNumber(16, 30),
                getNumber(31, 45),
                getNumber(46, 60),
                getNumber(61, 75));

        // Row 3 (FREE in the middle)
        System.out.printf("%2d  %2d  FREE %2d  %2d\n",
                getNumber(1, 15),
                getNumber(16, 30),
                getNumber(46, 60),
                getNumber(61, 75));

        // Row 4
        System.out.printf("%2d  %2d  %2d  %2d  %2d\n",
                getNumber(1, 15),
                getNumber(16, 30),
                getNumber(31, 45),
                getNumber(46, 60),
                getNumber(61, 75));

        // Row 5
        System.out.printf("%2d  %2d  %2d  %2d  %2d\n",
                getNumber(1, 15),
                getNumber(16, 30),
                getNumber(31, 45),
                getNumber(46, 60),
                getNumber(61, 75));
    }

    // This method generates a random number in a range
    public static int getNumber(int min, int max) 
    {
        return (int)(Math.random() * (max - min + 1)) + min;
    }
}

/* Screendump 

 B   I   N   G   O
 6  20  39  49  74
 2  19  36  51  65
11  17  FREE 47  67
 2  16  45  47  73
12  20  34  54  69


*/