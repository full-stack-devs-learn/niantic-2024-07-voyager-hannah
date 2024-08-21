package com.niantic.part_1;

public class Rectangle {
    private int width;
    private int height;



    public int getWidth() {
        if (width < 0) {
            return 0;
        }
        {
            return width;
        }
        }


    public void setWidth(int width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public int getHeight() {
        if (height < 0) {
            return 0;
        }
         {
            return height;
        }

    }

    public void setHeight(int height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    //public Rectangle() {
      //  width = 5;
      // height = 5;

    //}
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;

    }

    public int getArea() {
        if (width <= 0 || height <= 0) {
            return 0;
        } else {
            return width * height;
        }
    }
    public int getPerimeter() {
        if (width <= 0 || height <= 0) {
            return 0;
        } else {
            return 2 * (width + height);
        }
    }
}

