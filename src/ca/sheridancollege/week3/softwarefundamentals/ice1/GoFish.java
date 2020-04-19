
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 5 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modified by Liz Dancy, January 18th, 2019
 * @modified by Mayamba
 */
public class GoFish extends Card {
    
    public static void main(String[] args) {
        
        
        ArrayList <Card> deckSize = new ArrayList<Card>();
        
        Scanner sc = new Scanner(System.in);
       // int deckSize = 52;
        String choice;
        
      while (true)  {
          System.out.println("Play Go Fish? yes or no?");
          choice = sc.next();
           
           choice = choice.trim();
          if (choice.equals("yes")) {
              System.out.println("Pick up 5 cards");
              break;
          }
          else if (choice.equals("no")){
              System.out.println("See you next time!!!");
          System.exit(0);
      } else {
              System.out.println("Invalid");
          }
      }// end of while loop
     
        
               
            for (int i = 0;i < 4; i++){
                
                for (int j = 0; j< 13; j++){
                    // Generates 
                    deckSize.add(new Card(Suit.getSuit(i),CardName.getCardname(j)));
                    
                    // System.out.println(new Card(Suit.getSuit(i),CardName.getCardname(j)).toString());
                } // end of for loop
                    
            } //end of for loop
            
            ArrayList <Card> pickUp = GoFish.pickUpCards ( deckSize,5);
            deckSize.removeAll(pickUp);
            // Generates 5 random cards to start off with
            for(Card e: pickUp){
                
                System.out.println(e.toString());
                
            } // End of for each loop
            
            System.out.println("Pick number 1 to guess the card");
            Card c = new Card();
            String decide = sc.nextLine();
            String guess = sc.findInLine(decide);

            while (true){
            switch(decide) {
//                case 1: // Guess the card
//                    for (int j = 0; j < deckSize.size(); j++){
//                        if (GoFish.guessCard(deckSize) == ) {
//                            System.out.println("Player recieved: " + c.toString());
//                        }
//                    } 
//                        
//                case 2:              
//                }
            
            }
        
        
       
        
        

        
        } //end main
    /**
     * This method 
     * @param deckSize
     * @param pickUpNum
     * @return pickUp
     */
    public static ArrayList <Card>  pickUpCards (ArrayList <Card> deckSize, int pickUpNum) {
       
        //Check if the number of cards is greater than deck size
           if (pickUpNum > deckSize.size()){
               return null;
               
           } else {
               // Generate random number (shuffling the deck) that comes into
               //out hand
               ArrayList <Card> pickUp = new ArrayList <Card>();
               for (int i = 0; i < pickUpNum; i++){
                   int rand = new Random().nextInt(deckSize.size());
                   pickUp.add(deckSize.get(rand));
                   deckSize.remove(rand);
               } // end of for loop
                return pickUp;
           }       
} // end of pickUpCards method
    /**
     * this method check how many cards are still left in the deck
     * @param deckSize
     * @return 
     */
   // public static int update(ArrayList <Card> deckSize) {
        
     //   return deckSize.size() + pickUpCards;
//        for (int i = 0; i < deckSize.size() - ; i--) {
//            System.out.println("There are this many cards left in the deck"
//            + deckSize.size());
//        }
        
    }// end of update method
    
    public static void guessCard(ArrayList <Card> deckSize){
        
        Card deck = new Card();
        
        Random rand = new Random();
        int index = rand.nextInt(deckSize.size());
        
        for (int i = 0; i < index; i++){
           System.out.println(deckSize.get(index)+ deck.toString());
            
        } // end of for loop
        
        // Loop through enum CardName
//        for (CardName cd: CardName.values()){
//            
//        }
       
        
    }// end of guessCard Method
    
//    public ArrayList CheckMatches(ArrayList <Card> deckSize){
//        
//        for (int i = 0; i< deckSize.size(); i++){
//            
//            Card card = new Card();
//            if (deckSize)
//        }
//    }
        
    
}// end of class
