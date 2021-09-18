package exercise09;

import java.util.Scanner;

/*
    In this one, it's more of the same for the last 2 assignments
    however, we're going to be using % to find remainder
 */

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 7
 *  Copyright 2021 Dustin Battles
 */

public class solution09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String stringThatChecksForInts;

        int loop = 0, squareFootage = 0;

        while(loop == 0)
        {
            System.out.println("How many square footage u wanna paint?");
            stringThatChecksForInts = input.nextLine();

            if(numberTester(stringThatChecksForInts))
            {
                System.out.println("Thanks.");
                squareFootage = Integer.parseInt(stringThatChecksForInts);
                loop = 1;
            } else{
                System.out.println("Bro this ain't a number!");
            }
        }

        int howManyBuckets = squareFootage/350;
        int howMuchLeftover = squareFootage%350;
        if(howMuchLeftover > 0)
        {
            howManyBuckets += 1;
        }

        System.out.printf("The amount of buckets you'll need to fill up %d square feet is %d", squareFootage, howManyBuckets);
    }

    static boolean numberTester(String input)
    {
        try{
            Integer.parseInt(input);
        }
        catch(NumberFormatException ex){
            return false;
        }
        return true;
    }
}

