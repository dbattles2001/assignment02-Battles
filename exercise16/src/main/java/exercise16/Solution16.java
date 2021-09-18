package exercise16;

import java.util.Scanner;

/*
    Use a ternary operator to tell whether or not you're old enough to drive
    Pretty straightforward.
 */

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 16
 *  Copyright 2021 Dustin Battles
 */

public class Solution16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;

        System.out.println("What is your age?");
        age = input.nextInt();

        String result = (age>=16) ? "Yes, you can drive." : "You're too young to drive.";

        System.out.println(result);
    }
}
