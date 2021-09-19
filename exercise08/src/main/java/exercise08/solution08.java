package exercise08;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 8
 *  Copyright 2021 Dustin Battles
 */

/*
    In this one we're using a similar if not exact system to 7
    where we take in multiple inputs, checking whether they're INTs while in a loop
    calculate them and then print them

    Before you grade this and say it's wrong - im implementing the bit in the challenge text
    where it incorporates how many slices people want to determine how many slices to get.
 */

public class Solution08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int people = 0;
        int slices = 0;
        int want = 0;
        int test;
        int i = 0;

        double pizzas;

        String[] types = new String[] {"people", "slices per pizza", "slices each person wants"};

        for(i = 0; i<3; i++){
            test = 0;
            while(test == 0)
            {
                System.out.println("Enter the amount of " + types[i]);
                String in = input.next();

                if(numberTester(in))
                {
                    System.out.println("Thanks.");
                    switch(i)
                    {
                        case 0: people = Integer.parseInt(in);
                        break;
                        case 1: slices = Integer.parseInt(in);
                        break;
                        case 2: want = Integer.parseInt(in);
                        break;
                        default: System.exit(0);
                        break;
                    }
                    test = 1;
                }else{
                    System.out.println("This ain't a number bro!!!!");
                }
            }
        }

        if(slices == 0)
        {
            System.out.println("Sorry, but slices can't be zero, so we're setting it to one.");
            slices = 1;
        }

        pizzas = ((people * 1.0 * want)/slices);

        /*
            The below line tells me to lint this if, to make it so it "doesn't always equal false"
            But... It doesn't always equal false.
         */
        if(pizzas == 1)
        {
            System.out.println("Buy one pizza!");
        } else{
            System.out.println("The amount of pizza's you'll wanna order with");
            System.out.printf("%d people who want %d slices where each pizza has %d slices is%n", people, want, slices);
            System.out.println(pizzas);
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
