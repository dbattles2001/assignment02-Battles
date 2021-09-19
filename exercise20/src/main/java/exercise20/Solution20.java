package exercise20;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 20
 *  Copyright 2021 Dustin Battles
 */

/*
    This one will do a couple things.
    1. Ask and store your state, then your county
    2. Grab the info regarding that state's county using if's, or maybe an array I'll make
    3. Print the results
 */

public class Solution20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double orderAmount;
        double calculatedAmount = 0;
        double tax;

        //Orange county has a 6.5% sales tax I believe. So i'll just say they have a 5% with a county 1.5%
        double[] stateTax = {0.05, 0.08, 0.05};
        double[] countyTax = {0.005, 0.004, 0.015};

        String state = "";
        String county = "";

        System.out.println("What is the order amount?");
        orderAmount = input.nextDouble();

        System.out.println("What state do you live in? (Choose Florida, Wisconsin, or Illinois)");
        state = input.next();

        System.out.printf("Which county in %s? (Choose Orange if FL, or Eau Claire or Dunn for WI)%n", state);
        county = input.next();

        if(state.equalsIgnoreCase("Wisconsin"))
        {
            if(county.equalsIgnoreCase("Eau Claire")){
                calculatedAmount = orderAmount*(1+stateTax[0]+countyTax[0]);
            }
            else if(county.equalsIgnoreCase("Dunn")){
                calculatedAmount = orderAmount*(1+stateTax[0]+countyTax[1]);
            }
        } else if(state.equalsIgnoreCase("Illinois")){
            calculatedAmount = orderAmount*(1+stateTax[1]);
        } else if(state.equalsIgnoreCase("Florida")){
            if(county.equalsIgnoreCase("Orange")){
                calculatedAmount = orderAmount*(1+stateTax[2]+countyTax[2]);
            }
        } else{
            System.out.println("It seems you've entered an incorrect state, which will lead to garbage values.");
        }

        tax = calculatedAmount - orderAmount;
        calculatedAmount = Math.round(calculatedAmount*100.0)/100.0;
        tax = Math.round(tax*100.0)/100.0;

        System.out.printf("The tax is %.2f%nThe total is %.2f", tax, calculatedAmount);
    }
}
