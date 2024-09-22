package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MontyHallGameTest {
    private MontyHallGame game;

    @Before
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
        assertTrue(wins > 600); // Expect to win more than 60% of the time
    }

    @Test
    public void testPlayStay() {
        int wins = 0;
        for (int i = 0; i < 1000; i++) {
            if (game.play(false)) {
                wins++;
            }
        }
        assertTrue(wins < 400); // Expect to win less than 40% of the time
    }
}
