package com.curso.testing.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * System:                 CleanBnB
 * Name:                   PlayerTest
 * Description:            Class that represents a PlayerTest's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/9/21
 */
public class PlayerTest
{
    @Test
    public void looses_when_dice_number_is_too_low(){
        //Dice dice = new Dice(6);
        //creando el mock
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(2);
        Player player = new Player(dice,3);
        assertEquals(false,player.play());
    }
    @Test
    public void wins_when_dice_number_is_big() {

        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(4);

        Player player = new Player(dice, 3);
        assertTrue(player.play());
    }
}