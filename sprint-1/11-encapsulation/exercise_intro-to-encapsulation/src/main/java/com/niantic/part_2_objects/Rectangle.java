package com.niantic.part_2_objects;

public class Rectangle
{ private int Height;
  private int Width;


  public Rectangle(){

  }

  public Rectangle(int Height, int Width) {
      this.Height = Height;
      this.Width = Width;


  }
        //get and set height

    public int getHeight(){return Height;}
    public void setHeight(int Height) {this.Height = Height;}

    // get and set width

    public int getWidth() {return Width;}
    public void setWidth(int Width) {this.Width = Width;}

    //calculate area

    public int getArea() {return Width*Height;}



}
