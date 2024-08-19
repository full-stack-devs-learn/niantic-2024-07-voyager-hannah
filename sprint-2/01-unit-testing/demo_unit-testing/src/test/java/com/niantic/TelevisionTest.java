package com.niantic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest
{
    //important to have new television object use before each

    private Television tv;

    @BeforeEach
    public void setup()
    {
        tv = new Television();
    }
    @Test
    public void togglePower_shouldTurnTVOn_whenItIsOff()
    {
        //arrange
        Television tv = new Television();
        tv.togglePower();
        int expectedChannel = 3;
        int expectedVolume = 2;

        //act
        tv.togglePower();

        //assert
        boolean isTvOn = tv.isOn();
        int actualChannel = tv.getCurrentChannel();
        int actualVolume = tv.getCurrentVolume();

        assertTrue(isTvOn, "Because the TV was off when I toggled the power");
        assertEquals(expectedChannel, actualChannel, "Because the TV was just turned off the channel should be -1");
        assertEquals(expectedVolume,actualVolume, "Because the TV was just turned off the volume should be -1" );
    }

    @Test
    public void changeChannel_shouldSucceed_whenChannelIsInRange() {

        //arrange
        //Television tv = new Television();// you don't need this because before each setUp

        int expectedChannel = 7;
        tv.togglePower();

        //act
        boolean didChannelChanged = tv.changeChannel(expectedChannel);

        //assert
        assertTrue(didChannelChanged, "Because the new channel was in the range of the availablechannels");
        int actualChannel = tv.getCurrentChannel();
        assertEquals(expectedChannel, actualChannel, "Because the channel should have changed");


    }

}

