package com.ismael;

public class Validation {
    //i created this class to return a certain number if the users card is greater , less than or equal to
    public boolean winner(Card human, Card computer) {
        boolean winner = true;
        if (human.getNumber() > computer.getNumber()) {
            winner = true;
        } else if (human.getNumber() < computer.getNumber()) {
            winner = false;
        }
        return winner;
    }
}

