
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeeni
 * Date 28th Jan
import java.util.*;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue((int) (1+ Math.random()*13));
            int j;
            j = (int) (Math.random()*4);
            card.setSuit(Card.SUITS[j]);
            hand[i] = card;
        }
        System.out.println("Please choose from the following suits \n Hearts \n Clubs \n Spades \n Diamonds");
        String a = input.next();
        
        System.out.println("Choose the value from 1 to 13");
        int b = input.nextInt();
        
        for(int i =0;i<hand.length;i++){
            if(b == hand[i].getValue() && a.equalsIgnoreCase(hand[i].getSuit()))
                printInfo();
        }
         System.out.println("The random cards were");
         for(int i=0;i<hand.length;i++){
             System.out.println(hand[i].getValue() + " of "+hand[i].getSuit() );
         }
                
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}