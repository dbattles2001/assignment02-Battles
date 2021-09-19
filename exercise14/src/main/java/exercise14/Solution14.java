package exercise14;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 14
 *  Copyright 2021 Dustin Battles
 */

/*
    This one is actually not super simple. What you do is take the input
    If you have no tax then the input is the output
    However, if the string is WI, then you have tax, so inside an if(WI) loop
    You'll calculate the tax and make it so here is the only time the total changes
 */

public class Solution14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double orderAmount;
        double tax = 1.055;
        double total;
        double subtotal;

        String state;

        System.out.println("What is the order amount?");
        orderAmount = input.nextDouble();

        System.out.println("What state?");
        state = input.next();

        total = orderAmount;

        if(state.equals("WI")){
            orderAmount = Math.round(orderAmount*100.0)/100.0;
            System.out.printf("%nYour subtotal is: $%.2f%n", orderAmount);
            subtotal = (orderAmount * tax) - orderAmount;
            total = orderAmount + subtotal;
            subtotal = Math.round(subtotal*100.0)/100.0;
            System.out.printf("%nYour tax is: $%.2f%n", subtotal);
        }
        total = Math.round(total*100.0)/100.0;
        System.out.printf("%nYour total is: $%.2f", total);
    }
}
