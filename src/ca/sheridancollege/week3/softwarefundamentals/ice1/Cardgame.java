/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack -11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 
 * The goal:
 * 
 * add your name as a modifier.
 * @modifier Mayamba Boka-Mbambu
 */
public class Cardgame {

   private String suit; //clubs, spades, diamonds, hearts
   private String cardName; //2,3,4,5,6,7,8,9,10,Jack,Queen,King,Ace
   private int value; //1-13

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
   
   
   public Cardgame(String suit, int value, String cardName) {
       this.suit = suit;
       this.value = value;
       this.cardName = cardName;
   }
   
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the cardName
     */
    public String getCardName() {
        return cardName;
    }

    /**
     * @param cardName the cardName to set
     */
    public void setCardName(String cardName) {
        this.cardName = cardName;
    }
    
    
   
   
    
}
