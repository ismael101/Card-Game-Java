package com.ismael;

import java.io.IOException;
import java.util.ArrayList;
import static input.InputUtils.intInput;
import static input.InputUtils.yesNoInput;
public class Main {
	//I ran the program here
	public static void main(String[] args) {
		Deck deck = new Deck();
		Human me = new Human();
		Computer cpu = new Computer();
		Validation valid = new Validation();
		System.out.println("WELCOME LETS PLAY THE GAME AGRAM\n");
		System.out.println("IT IS YOU AGAINST THE COMPUTER\n");
		System.out.println("EACH OF THE PLAYERS HAVE THREE CARDS\n\n" +
				"WHEN PLAYING A CARD THE OTHER PLAYER MUST HAVE A CARD OF THE SAME SUIT\n\n" +
				"IF YOU DONT HAVE A CARD OF THE SANE SUIT THEN YOU CAN PLAY ANY CARD IN THE DECK\n");
		//this will continuosly run until it breaks when the deck is empty
		while (true) {
			//i added a try cath statemetn to dea with index errors
			try{
			//this counts the winner and the looser
			int cpuwinner = 0;
			int userwinner = 0;
			int cpuposition = 0;
			System.out.println("YOUR CARDS\n");
			//this shows your cards and the cpu's cards
			me.showCards();
			System.out.println("\nCPU'S PLAYS THIS CARD\n");
			System.out.println(cpu.getCard(0));
			//for every card in your deck it tells you which ones have same suit
			for (Card c : me.mycards) {
				if(c.checksuits(cpu.getCard(0))){
					System.out.println("YOU ARE RECOMMENDED TO PLAY THIS/THESE CARD ");
					System.out.println(c);
				} }
				//the rest of the code see which card is larger and uses the various functions to see the winner
			int postion = intInput("Enter the card here: ");
			if(valid.winner(me.getCard(postion),cpu.getCard(0))){
				userwinner = userwinner+1;
				System.out.println("YOU WON THIS ROUND");
				me.deletecard(postion);
				cpu.deleteCard(0);
			}else {
				cpuwinner = cpuwinner+1;
				System.out.println("YOU LOST THIS ROUND");
				me.deletecard(postion);
				cpu.deleteCard(0);
			}
		//this ends the program and shows the winner
			if(me.mycards.isEmpty()){
			System.out.println("GAME IS OVER\n\n");
			System.out.println(deck.getWinner(userwinner,cpuwinner));
			break;}}
			catch(IndexOutOfBoundsException is){
				System.out.println("YOU ENTERED THE WRONG INDEX FOR THE CARD");
			}
	}}}