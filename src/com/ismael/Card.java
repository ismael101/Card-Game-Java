package com.ismael;
public class Card {
    private String suits;
    private int number;

    //this is the card class that contains all the attributes of a card

    Card(int num,String suit){
        this.number = num;
        this.suits = suit;
    }

    @Override
    public String toString() {
        String fullCard;
       if (number!=11){
           fullCard =  number +" of "+ suits; }
        else{
           fullCard = "Ace of "+ suits;
       }
        return fullCard;}


    //Qaalib helped me with this part of my code

    //This retruns the number of the card
    public int getNumber() {
        return number;
    }

    //this returns the suit of the card if needed
    public String getSuits() {
        return suits;
    }

    //this allows me to check if to cards have the same suits
    public boolean checksuits(Card cardsuits){
        Boolean flag;
        if(cardsuits.suits == this.suits){ flag = true; }
        else{flag = false;}
        return flag;}
}
