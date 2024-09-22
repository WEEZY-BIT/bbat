package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MontyHallGameTest {
    private MontyHallGame game;

    @BeforeEach
    public void setUp() {
        game = new MontyHallGame();
    }

    @Test
    public void testPlaySwitch() {
        int wins = 0;
        for (int i = 0; i < 1000; i++) {
            if (game.play(true)) {
                wins++;
            }
        }
        assertTrue(wins > 600, "Should win more than 60% of the time when switching");
    }

    @Test
    public void testPlayStay() {
        int wins = 0;
        for (int i = 0; i < 1000; i++) {
            if (game.play(false)) {
                wins++;
            }
        }
        assertTrue(wins < 400, "Should win less than 40% of the time when staying");
    }
}
