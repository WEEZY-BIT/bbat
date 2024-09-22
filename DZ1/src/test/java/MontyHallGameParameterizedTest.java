package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MontyHallGameParameterizedTest {
    private final boolean switchDoor;
    private final int expectedMinWins;

    public MontyHallGameParameterizedTest(boolean switchDoor, int expectedMinWins) {
        this.switchDoor = switchDoor;
        this.expectedMinWins = expectedMinWins;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            { true, 600 }, // Switch strategy
            { false, 400 } // Stay strategy
        });
    }

    @Test
    public void testPlay() {
        MontyHallGame game = new MontyHallGame();
        int wins = 0;
        for (int i = 0; i < 1000; i++) {
            if (game.play(switchDoor)) {
                wins++;
            }
        }
        assertTrue(wins >= expectedMinWins);
    }
}
