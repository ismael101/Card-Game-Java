package com.ismael;
import java.util.ArrayList;

import static input.InputUtils.intInput;
import static input.InputUtils.stringInput;
import static java.lang.System.in;
import static java.lang.System.setOut;

public class Human {
    //i created an instance of the deck class
    Deck deck = new Deck();
    ArrayList<Card> mycards = deck.HumanCard();

   //this class shows the user his/her "Hand"
    public void showCards(){
        int counter = 0;
        for(Card i: mycards){
            System.out.println(counter+" # "+i);
            counter = counter+1;}}

    //this class returns the card of a position in the ArrayList
    public Card getCard(int position) {
        return mycards.get(position);
    }
    //this class deletes the card of a position in the ArrayList
    public void deletecard(int position){
        mycards.remove(position);
        System.out.println("USER CARD REMOVED");
    }
}

