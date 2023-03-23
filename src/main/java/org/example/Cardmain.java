package org.example;
import card.Card;
import java.util.logging.Level;
import java.util.logging.Logger;
class Cardmain{
    public static void main(String[]args)throws CloneNotSupportedException{
        Card card1=new Card();
        Logger l =  Logger.getLogger("points");
        if(card1.cardcheck().equals("true"))
        {
        l.info("card with same number");
        }
        else{
        l.info("the card with diferent number");
        }
        Card card2 = (Card) card1.clone();
        l.info("the cloned card:");
        l.log(Level.INFO ,()-> "\n Holders name "+ card2.holdername);
        l.log(Level.INFO,()->"\n  Card Number "+card2.cardnumber);
        l.log(Level.INFO,()->"\n Expiration Date "+card2.expirationdate);


    }
}

