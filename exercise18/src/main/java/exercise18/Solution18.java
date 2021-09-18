package exercise18;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 18
 *  Copyright 2021 Dustin Battles
 */

/*
    Follow the instructions to use very little output code,
    Input the type you want first, go through a if else if to determine what formula u get
    Calculate accordingly.
 */

public class Solution18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you want celsius or fahrenheit? (c = celsius, f = fahrenheit)");
        String choice = input.nextLine();
        System.out.println("Either way, what's your first number?");
        double degrees = input.nextDouble();

        if(choice.equals("C")||choice.equals("c"))
        {
            double farenheit = ((degrees * 9)/5)+32;
            System.out.printf("%.2f degrees celsius is %.2f degrees farenheit", degrees, farenheit);
        }else if(choice.equals("F")||choice.equals("f")){
            double celsius = ((degrees - 32)*5)/9;
            System.out.printf("%.2f degrees farenheit is %.2f degrees celsius", degrees, celsius);
        }
    }
}
