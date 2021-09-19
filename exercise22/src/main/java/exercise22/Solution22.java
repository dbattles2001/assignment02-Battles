package exercise22;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 22
 *  Copyright 2021 Dustin Battles
 */

/*
    Im going to do the challenge version of this where you can hopefully enter any number of values
    by doing a while loop where each time it counts i up where i is the number in an array
 */

public class Solution22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int loop = 0;
        int i = 0;
        int size = 0;

        int[] numberArrayForSizing = new int[999];

        while(loop != 1){
            i++;
            size++;
            System.out.printf("What would you like #%d to be? (If you choose 1 it will end this loop.)%n", i);
            numberArrayForSizing[i] = input.nextInt();

            if(numberArrayForSizing[i] == 1){
                loop = 1;
            }
        }

        int greatest = numberArrayForSizing[1];
        int greatestNumber = 0;

        for(i = 1; i<size; i++){
            if(numberArrayForSizing[i] > greatest){
                greatest = numberArrayForSizing[i];
                greatestNumber = i;
            }
        }

        System.out.printf("The largest number is %d.", numberArrayForSizing[greatestNumber]);
    }
}
