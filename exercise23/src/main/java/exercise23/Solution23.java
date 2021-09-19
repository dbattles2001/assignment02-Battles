package exercise23;

import java.util.Scanner;

public class Solution23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice;
        String choiceTwo;

        System.out.println("What's the problem with your car?");
        System.out.println("1. It's not turning on");
        System.out.println("2. It's making strange noises");
        System.out.println("3. There's a warning light");
        System.out.println("(Please insert one of these numbers.)");

        choice = input.nextInt();

        if(choice == 1){
            System.out.println("Did you leave your lights on by accident? y/n");
            choiceTwo = input.next();
            if(choiceTwo.equalsIgnoreCase("Y")){
                System.out.println("Then charge your battery.");
            } else{
                System.out.println("Does it have gas in it?");
                choiceTwo = input.next();
                if(choiceTwo.equalsIgnoreCase("N")){
                    System.out.println("Then go get some gas.");
                } else{
                    System.out.println("I don't know what to tell you man.");
                }
            }
        }
        if(choice == 2){
            System.out.println("Did you check your gasket?");
            choiceTwo = input.next();
            if(choiceTwo.equalsIgnoreCase("N")){
                System.out.println("You might want to do that.");
            } else{
                System.out.println("Was it broken?");
                choiceTwo = input.next();
                if(choiceTwo.equalsIgnoreCase("Y")){
                    System.out.println("Then go fix it.");
                } else{
                    System.out.println("Is your muffler?");
                    choiceTwo = input.next();
                    if(choiceTwo.equalsIgnoreCase("N")){
                        System.out.println("I'd suggest taking it to a shop then.");
                    }else{
                        System.out.println("Sounds like you found the problem!");
                    }
                }
            }
        }
        if(choice == 3){
            System.out.println("Which light is it?");
            System.out.println("1. Gas light");
            System.out.println("2. Oil light");
            System.out.println("3. Check engine");
            System.out.println("Please input a corresponding number for the option.)");

            choice = input.nextInt();

            if(choice == 1){
                System.out.println("Go get some gas.");
            } else if(choice == 2){
                System.out.println("You're going to need some oil.");
            }else if(choice == 3){
                System.out.println("Have you checked the engine? y/n");
                choiceTwo = input.next();
                if(choiceTwo.equalsIgnoreCase("N")){
                    System.out.println("I'd suggest doing that.");
                }else{
                    System.out.println("Did you find the issue? y/n");
                    choiceTwo = input.next();
                    if(choiceTwo.equalsIgnoreCase("N")){
                        System.out.println("I'd suggest taking it to a shop then.");
                    }else{
                        System.out.println("What do you need my help for then?");
                    }
                }
            }
        }
    }
}
