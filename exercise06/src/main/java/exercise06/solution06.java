package exercise06;

import java.util.Scanner;
import java.util.Date;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 6
 *  Copyright 2021 Dustin Battles
 */

/*
    In this one we're just gonna ask them what their age and
    presumed/ wanted retirement age is, subtract em, and
    print that number lol
 */

public class solution06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date d = new Date();
        int year = d.getYear();
        int currentYear = year+1900;

        System.out.println("What is your current age?");
        int currAge = input.nextInt();
        System.out.println("At what age would you like to retire?");
        int retireAge = input.nextInt();
        if(retireAge <= currAge){
            System.out.println("It seems you can already retire!");
        }
        else{
            int retire = retireAge - currAge;
            System.out.printf("You're gonna wanna retire in %d years\n", retire);
            System.out.println("It's " + currentYear + " so you'll want to retire in " + (currentYear + retire));
        }
    }
}
