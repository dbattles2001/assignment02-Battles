package exercise12;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 12
 *  Copyright 2021 Dustin Battles
 */

/*
    In this one we're doing much of the same from the last one,
    however i'm going to make a calculateSimpleInterest function as
    listed in the challenges.
 */

public class Solution12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String in = "";

        int principal = 0;
        int interestRate = 0;
        int years = 0;

        String[] names = {"principal", "interest rate", "years"};

        for(int i = 0; i<3; i++){
            int loop = 0;
            while(loop == 0)
            {
                System.out.printf("%nWhat's the %s?%n", names[i]);
                in = input.next();

                if(numberTester(in))
                {
                    System.out.println("Thanks.");
                    switch(i)
                    {
                        case 0: principal = Integer.parseInt(in);
                        break;
                        case 1: interestRate = Integer.parseInt(in);
                        break;
                        case 2: years = Integer.parseInt(in);
                        break;
                        default: System.out.println("Whoops!");
                        break;
                    }
                    loop = 1;
                }else{
                    System.out.println("This ain't a number bro!!!!");
                }
            }
        }

        float floatInterestRate = (float) interestRate/100;
        float investment = principal * (1 + (floatInterestRate)*(years));
        double roundedInvestment = Math.round(investment*100.0)/100.0;

        System.out.printf("After %d years, at %.2f, the investment will be worth $%.2f", years, floatInterestRate, roundedInvestment);

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
