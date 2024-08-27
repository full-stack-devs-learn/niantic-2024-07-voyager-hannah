package com.niantic.models;

public class Card
{
    //private String color;
    private int number;

    public Card( int number)
    {
        this.number = number;
    }


    public int getValue()
    {
        return number;
    }
}
