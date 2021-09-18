package exercise15;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 15
 *  Copyright 2021 Dustin Battles
 */

/*
    For this one im gonna create a for to grab your username and there will be
    two usernames to choose from, each with their own password in a string array 0 and 1
    It will kick you out if you don't enter a correct username,
    but if you do, you'll go to one of the two if loops and be asked to insert a password
    which will be tested by an if(equals) loop just the same as the names.
 */

public class Solution15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username;
        String password;
        String[] passwords = {"one", "two"};

        System.out.println("Hello, please input your username. (Choose DUDE or HELLO)");
        username = input.nextLine();

        if(username.equals("DUDE"))
        {
            System.out.println("Please enter DUDE's password.");
            password = input.nextLine();

            if(password.equals(passwords[0])){
                System.out.println("Hello DUDE");
            }else{
                System.out.println("Wrong password. Goodbye.");
            }
        } else if(username.equals("HELLO")){
            System.out.println("Please enter HELLO's password.");
            password = input.nextLine();

            if(password.equals(passwords[1])){
                System.out.println("Hello, HELLO");
            }else{
                System.out.println("Wrong password. Goodbye.");
            }
        } else{
            System.out.println("Sorry, but you entered an incorrect username. Goodbye.");
        }
    }
}
