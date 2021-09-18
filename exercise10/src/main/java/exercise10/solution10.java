package exercise10;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 10
 *  Copyright 2021 Dustin Battles
 */

/*
    For this one we're gonna do a for loop and have it be like
    item[i] price[i] and then add everything up at the end
    and calculate it.
 */

public class solution10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String numberHolder = "";

        System.out.println("How many items would you like?");
        int numItems = input.nextInt();
        int loop = 0, loopTwo = 0;
        int[] itemPriceArray = new int[numItems];
        int[] itemQuantityArray = new int[numItems];

        for(int i = 0; i<numItems; i++){
            loop = 0;
            loopTwo = 0;
            while(loop == 0)
            {
                System.out.printf("What's the price of item %d?", (i+1));
                numberHolder = input.next();

                if(numberTester(numberHolder))
                {
                    System.out.println("Thanks.");
                    itemPriceArray[i] = Integer.parseInt(numberHolder);

                    loop = 1;
                }else{
                    System.out.println("This ain't a number bro!!!!");
                }
            }
            while(loopTwo == 0)
            {
                System.out.printf("What's the quantity of item %d?", (i+1));
                numberHolder = input.next();

                if(numberTester(numberHolder))
                {
                    System.out.println("Thanks.");
                    itemQuantityArray[i] = Integer.parseInt(numberHolder);

                    loopTwo = 1;
                }else{
                    System.out.println("This ain't a number bro!!!!");
                }
            }
        }

        int  subtotalHolder, subtotal = 0;

        for(int i = 0; i< numItems; i++){
            subtotalHolder = itemQuantityArray[i] * itemPriceArray[i];
            subtotal += subtotalHolder;
        }

        System.out.printf("Your subtotal is: %d\n", subtotal);

        double taxes = (subtotal * 1.055) - subtotal;

        System.out.printf("Tax: %f\n", taxes);

        double total = subtotal * 1.055;

        System.out.printf("Bringing your grand total to %f", total);
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
