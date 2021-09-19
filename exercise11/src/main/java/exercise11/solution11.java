package exercise11;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 11
 *  Copyright 2021 Dustin Battles
 */

/*
    This one is probably the easiest so far. If we're only ever asking to convert
    one thing to the other and not reverse or whatever its literally just
    the amount you put in multiplied by the conversion rate.
 */

import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float amountOfEuros;
        float conversionRate;
        float amountInDollars;

        System.out.println("How many Euros would you like to exchange?");
        amountOfEuros = input.nextFloat();

        System.out.println("What is the current exchange rate?");
        conversionRate = input.nextFloat();

        amountInDollars = amountOfEuros * conversionRate;
        double roundedDollars = (Math.round(amountInDollars*100.0)/100.0);

        System.out.printf("%f Euros at the exchange rate of %f is %f", amountOfEuros, conversionRate, roundedDollars);
    }
}
