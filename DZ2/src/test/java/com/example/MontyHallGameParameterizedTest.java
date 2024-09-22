package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MontyHallGameParameterizedTest {
    @ParameterizedTest
    @CsvSource({
        "true, 600",
        "false, 400"
    })
    public void testPlay(boolean switchDoor, int expectedMinWins) {
        MontyHallGame game = new MontyHallGame();
        int wins = 0;
        for (int i = 0; i < 1000; i++) {
            if (game.play(switchDoor)) {
                wins++;
            }
        }
        assertTrue(wins >= expectedMinWins, "Wins should be at least " + expectedMinWins);
    }
}
