package exercise07;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 7
 *  Copyright 2021 Dustin Battles
 */

/*
    In this one we're gonna ask the user for their inputs, testing each time
    using string parsing whether what they're giving us is an INT.

    Afterwords we will print the mathematics.

    For the one where it switches between feet and meters, i'll change it to have it ask for your selection first,
    and then the part where it prints the conversion will be flipped according to that value
    which will be like "meter = 1 or 0"
 */

public class Solution07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length = 0;
        int width = 0;
        int test = 0;
        int choice;

        double constantMeters = 0.09290304;
        double constantFeet = 3.28084;

        String[] types = new String[] {"length", "width"};

        System.out.println("What would you like to measure in? 0 = feet, 1 = meters");
        choice = input.nextInt();

        for(int i = 0; i<2; i++){
            test = 0;
            while(test == 0)
            {
                System.out.println("Enter the " + types[i]);
                String in = input.next();

                if(numberTester(in))
                {
                    System.out.println("Thanks.");
                    if(i == 0){
                        length = Integer.parseInt(in);
                    }
                    else{
                        width = Integer.parseInt(in);
                    }
                    test = 1;
                }else{
                    System.out.println("This ain't a number bro!!!!");
                }
            }
        }

        System.out.println("You entered the dimensions " + length + " and " + width);
        int sqr = length * width;

        if(choice == 0){
            System.out.printf("Your square feet is %d%n", sqr);
            double sqrTwo = sqr * constantMeters;
            System.out.printf("Your square meters is %f", sqrTwo);
        }
        else{

            System.out.printf("Your square meters is %d%n", sqr);
            double sqrTwo = sqr * constantFeet;
            System.out.printf("Your square feet is %f", sqrTwo);
        }
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
