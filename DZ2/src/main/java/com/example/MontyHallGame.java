package com.example;

import java.util.Random;

public class MontyHallGame extends Game {
    private final Random random = new Random();

    @Override
    public boolean play(boolean switchDoor) {
        int winningDoor = random.nextInt(3);
        int chosenDoor = random.nextInt(3);

        int revealedDoor;
        do {
            revealedDoor = random.nextInt(3);
        } while (revealedDoor == winningDoor || revealedDoor == chosenDoor);

        if (switchDoor) {
            chosenDoor = 3 - chosenDoor - revealedDoor;
        }

        return chosenDoor == winningDoor;
    }
}
