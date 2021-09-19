package exercise17;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 17
 *  Copyright 2021 Dustin Battles
 */

/*
    In this one we're doing more of the same. Take the inputs only allowing nextNumbers as
    required, use the formula, and compare using if statements.
 */

public class Solution17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weight;
        double oz;
        double hoursSinceLastDrink;
        int gender;
        double solution;

        System.out.println("How much have you had to drink today? (in oz)");
        oz = input.nextDouble();

        System.out.println("No offense, but how much do you weigh? (in lbs");
        weight = input.nextDouble();

        System.out.println("How many hours has it been since your last drink?");
        hoursSinceLastDrink = input.nextDouble();

        System.out.println("Lastly, and again, no offense, are you a dude or a girl? (0 = girl, 1 = dude)");
        gender = input.nextInt();

        if(gender == 0)
        {
            solution = ((oz * 5.14)/(weight * 0.66)) - (0.15 * hoursSinceLastDrink);

            if(solution > 0.08)
            {
                System.out.printf("Your BAC is %f, you're going to jail!", solution);
            }else{
                System.out.printf("Your BAC is %f, you're good to go.", solution);
            }
        } else {
            solution = ((oz * 5.14) / (weight * 0.73)) - (0.15 * hoursSinceLastDrink);

            if (solution > 0.08) {
                System.out.printf("Your BAC is %f, you're going to jail!", solution);
            } else {
                System.out.printf("Your BAC is %f, you're good to go.", solution);
            }
        }
    }
}
