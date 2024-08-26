package com.niantic.models;

public class Card
{
    //private String color;
    private int number;

    public Card( int number)
    {
    //    this.color = color;
        this.number = number;
    }

   // public String getColor()
   // {
    //   return color;
   // }

    public int getValue()
    {
        return number;
    }
}
