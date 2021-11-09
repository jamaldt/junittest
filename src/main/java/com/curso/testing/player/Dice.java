package com.curso.testing.player;

import java.util.Random;

/**
 * System:                 CleanBnB
 * Name:                   Dice
 * Description:            Class that represents a Dice's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/9/21
 */
public class Dice {

    private int sides;

    public Dice(int sides) {
        this.sides = sides;
    }

    public int roll() {
        return new Random().nextInt(sides) + 1;
    }
}
