package com.ismael;

import java.util.ArrayList;
import java.util.Random;

public class Computer {
    //i created a instance of the deck
    Deck deck = new Deck();
    ArrayList<Card> cpucards = deck.ComputerCard();

    // this returns the card of a given position in the Arraylist
    public Card getCard(int position) {
        return cpucards.get(position);
    }
    //this was used in debugging tomsee all the cards of the computers deck and they were effected
    public void showCards(){
        int counter = 0;
        for(Card i: cpucards){
            System.out.println(counter+" # "+i);
            counter = counter+1;}}
    //this deletes a card after the after it is used in a round
    public void deleteCard(int position){
        cpucards.remove(position);
        System.out.println("CPU CARD REMOVED");
    }
}
