package exercise13;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 13
 *  Copyright 2021 Dustin Battles
 */

/*
    Copying 12 over to 13 but changing the formula, which has proven harder than
    I though, as I'm on my second instance of this project. Hm!
 */

public class Solution13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String in = "";

        int principal = 0;
        int compoundTimes = 0;
        float interestRate = 0;
        float years = 0;

        String[] names = {"principal", "interest rate", "years", "amount of times it compounds each year"};

        for(int i = 0; i<4; i++){
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
                        case 1: interestRate = Float.parseFloat(in);
                            break;
                        case 2: years = Float.parseFloat(in);
                            break;
                        case 3: compoundTimes = Integer.parseInt(in);
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
        interestRate /= 100;

        if(compoundTimes == 0){
            System.out.println("Sorry, but compound times cant be zero, so we're changing it to one.");
            compoundTimes = 1;
        }
        float investment = (float) (principal * Math.pow((1+interestRate/compoundTimes), (compoundTimes*years)));
        double roundedInvestment = Math.round(investment*100.0)/100.0;

        System.out.printf("After %.0f years, at %.0f percent interest, the investment will be worth $%.2f", years, (interestRate*100), roundedInvestment);

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
