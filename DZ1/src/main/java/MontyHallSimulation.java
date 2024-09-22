package com.example;

public class MontyHallSimulation {
    public static void main(String[] args) {
        MontyHallGame game = new MontyHallGame();
        int switchWins = 0;
        int stayWins = 0;
        int simulations = 1000;

        for (int i = 0; i < simulations; i++) {
            if (game.play(true)) {
                switchWins++;
            }
            if (game.play(false)) {
                stayWins++;
            }
        }

        System.out.println("Wins by switching: " + switchWins);
        System.out.println("Wins by staying: " + stayWins);
    }
}
