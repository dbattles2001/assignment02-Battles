package exercise21;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 19
 *  Copyright 2021 Dustin Battles
 */

/*
    Incredibly simple. Ask for a number one through twelve and use a switch statement to tell the
    corresponding month, exactly as the instructions tell you to do
 */

public class Solution21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int monthNumber;

        System.out.println("Give me a number, and I'll tell you its corresponding month! (Please choose 1-12)");
        monthNumber = input.nextInt();

        if(monthNumber < 1 || monthNumber > 12){
            System.out.println("Very funny. You chose an incorrect number even though I told you not to. Bye.");
        } else{
            switch(monthNumber){
                case 1: System.out.println("Your month is January!");
                break;
                case 2: System.out.println("Your month is February!");
                    break;
                case 3: System.out.println("Your month is March!");
                    break;
                case 4: System.out.println("Your month is April!");
                    break;
                case 5: System.out.println("Your month is May!");
                    break;
                case 6: System.out.println("Your month is June!");
                    break;
                case 7: System.out.println("Your month is July!");
                    break;
                case 8: System.out.println("Your month is August!");
                    break;
                case 9: System.out.println("Your month is September!");
                    break;
                case 10: System.out.println("Your month is October!");
                    break;
                case 11: System.out.println("Your month is November!");
                    break;
                case 12: System.out.println("Your month is December!");
                    break;
                default: System.out.println("Nope, you messed it up. Bye");
                break;
            }
        }
    }
}
