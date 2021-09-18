package exercise19;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 19
 *  Copyright 2021 Dustin Battles
 */

/*
    For this one im going to use a checker loop to make sure their inputs are indeed numbers, similar to the early 10's
    of this assignment. It will scan in their height and weight and add it, then compare it to a couple of if
    statements. Should be easy.
 */

public class Solution19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String numberTest = "";
        String[] questions = {"How much do you weigh?", "How tall are you? (in inches)"};
        double weight = 1;
        double height = 1;

        for(int i = 0; i<2; i++)
        {
            int loop = 0;
            while(loop == 0){
                System.out.println(questions[i]);
                numberTest = input.next();

                if(numberTester(numberTest))
                {
                    System.out.println("Thanks.");

                    switch(i)
                    {
                        case 0: weight = Double.parseDouble(numberTest);
                        break;
                        case 1: height = Double.parseDouble(numberTest);
                        break;
                        default: System.out.println("Uh oh!");
                        break;
                    }

                    loop = 1;
                } else{
                    System.out.println("This isn't a number.");
                }
            }
        }

        double bmi = (weight / (height * height)) * 703;

        if(bmi < 18.5)
        {
            System.out.printf("Your BMI is %.1f, you might be underweight.", bmi);
        } else if (bmi >= 18.5 || bmi <= 25){
            System.out.printf("Your BMI is a healthy %.1f", bmi);
        } else{
            System.out.printf("It seems your BMI is %.1f, which is a little overweight.", bmi);
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
