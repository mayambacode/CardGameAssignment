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
public class Card {

   private Suit suit; //clubs, spades, diamonds, hearts
   private CardName cardName; //2,3,4,5,6,7,8,9,10,Jack,Queen,King,Ace
   // private int value; //1-13


   // public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
   
   enum Suit {
       Hearts,
       Diamonds,
       Spades,
       Clubs;
       
        private static final Suit[] type = Suit.values();
        public static Suit getSuit (int s){
            return Suit.type[s];
        }
            
   }
   
   enum CardName {
       One, Two, Three, Four, Five, Six, Seven,Eight, Nine,
       Jack, Queen, King, Ace;
       
       private static final CardName[] name = CardName.values();
       public static CardName getCardname (int a){
           return CardName.name[a];
       }
   }
   
   public Card (Suit suit,CardName cardName) {
       this.suit = suit;
       
       this.cardName = cardName;
   }

    Card() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public CardName getCardName() {
        return cardName;
    }

    public void setCardName(CardName cardName) {
        this.cardName = cardName;
    }

    
    @Override
    public String toString() {
        
        return cardName + " of " + suit;
    }
   
   
    
}
