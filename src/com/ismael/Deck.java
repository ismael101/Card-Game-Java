package com.ismael;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/**
 * Created by uy5486cf on 10/25/2017.
 */
public class Deck{
    //i created a card ArrayList and strings with the names of the suits
    ArrayList<Card> cardDeck = new ArrayList<Card>();
    private String hearts = "hearts";
    private String diamonds = "diamonds";
    private String clubs = "clubs";
    private String spades = "spades";
    public int userwinner;
    public int computerwinner;
    Deck(){
        //Qaalib helped me with this code
        //this created all the cards of the nessacary suits
        int counter = 0;
        while(counter<1){
            for(int a = 2; a <12;a++) {
                cardDeck.add(new Card(a,hearts)); }
            for(int b = 2; b <12; b++){
                cardDeck.add(new Card(b,diamonds));
            }
            for (int c = 2; c<12; c++){
                cardDeck.add(new Card(c,clubs));
            }
            for(int d =2;d<11;d++){
                cardDeck.add(new Card(d,spades));
            }
            counter = counter+1;
        }
        //this shuffles the cards
        Collections.shuffle(cardDeck); }
    //this retruns the cards for the user
    public ArrayList<Card> HumanCard(){
        ArrayList<Card> humandeck = new ArrayList<Card>();
        for(int x=0;x<3;x++){
            humandeck.add(cardDeck.get(x));
            cardDeck.remove(x); }
            return humandeck;}
    //this returns cards for the computer
    public ArrayList<Card> ComputerCard(){
        ArrayList<Card> computerdeck = new ArrayList<Card>();
        for(int x=0;x<3;x++){
            computerdeck.add(cardDeck.get(x));
            cardDeck.remove(x); }
            return computerdeck;}
    //i created this to give take the points of the respective players and display who won,who lost and if it was a tie
    public String getWinner(int myvalue,int cpuvalue){
        String winner;
        userwinner = myvalue;
        computerwinner = cpuvalue;
        if(userwinner>computerwinner);{
            winner = "YOU ARE THE WINNER"; }
        if(computerwinner<userwinner){
            winner = "THE COMPUTER IS THE WINNER"; }
        if(computerwinner==userwinner){
            winner = "THE MATCH WAS A DRAW"; }
        return winner; }
}