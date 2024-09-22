package com.example;

import java.util.Random;

public class MontyHallGame {
    private final Random random = new Random();

    public boolean play(boolean switchDoor) {
        int winningDoor = random.nextInt(3);
        int chosenDoor = random.nextInt(3);

        // Simulate the host opening a door
        int revealedDoor;
        do {
            revealedDoor = random.nextInt(3);
        } while (revealedDoor == winningDoor || revealedDoor == chosenDoor);

        if (switchDoor) {
            chosenDoor = 3 - chosenDoor - revealedDoor; // Switch to the remaining door
        }

        return chosenDoor == winningDoor;
    }
}
