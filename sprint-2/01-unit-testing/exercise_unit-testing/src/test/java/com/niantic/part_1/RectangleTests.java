package com.niantic.part_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTests
{
    @Test
    public void returnThe_areaOfTheRectangle() {

        //arrange
        int width =5;
        int height=5;
        int expectedArea = width * height;
        Rectangle rectangle = new Rectangle(width, height);

        //act
        int actualArea = rectangle.getArea();

        //assert
        assertEquals(expectedArea, actualArea, "Should return accurate area of rectangle");

    }

    @Test
    public void returnThe_perimeterOfTheRectangle() {
        //arrange
        int width=5;
        int height=5;
        int expectedPerimeter = 2 *(width + height);;


        //act
        Rectangle rectangle = new Rectangle(width, height);
        int actualPerimeter = rectangle.getPerimeter();

        //assert
        assertEquals(expectedPerimeter, actualPerimeter, "Should return accurate perimeter");

    }

    @Test
    public void widthAndHeightPerimeter_shouldNotReturn_negativeNumbersIfNegative_onlyZero() {
        //arrange
        int width = -5;
        int height = -5;
        int expectedWidth = 0;
        int expectedHeight = 0;
        int expectedPerimeter = 0;

        //act
        Rectangle rectangle = new Rectangle(width,height);
        int actualWidth = rectangle.getWidth();
        int actualHeight = rectangle.getHeight();
        int actualPerimeter = rectangle.getPerimeter();


        //assert
        assertEquals(expectedWidth, actualWidth, "Width should be 0, and should never be negative");
        assertEquals(expectedHeight, actualHeight, "Height should be 0 when width is negative");
        assertEquals(expectedPerimeter,actualPerimeter, "When calculating, perimeter should be 0");


    }
    @Test
    public void widthAndHeight_area_shouldNotReturn_negativeNumberIfNegative_onlyZero() {
        //arrange
        int width = -1;
        int height = -1;
        int expectedWidth = 0;
        int expectedHeight = 0;
        int expectedArea = 0;

        //act
        Rectangle rectangle = new Rectangle(width,height);
        int actualWidth = rectangle.getWidth();
        int actualHeight = rectangle.getHeight();
        int actualArea = rectangle.getArea();

        //assert
        assertEquals(expectedWidth, actualWidth, "Width should be 0, if width is negative");
        assertEquals(expectedHeight,actualHeight, "Height should be 0, if height is negative");
        assertEquals(expectedArea, actualArea, "area should return 0 when width and height are negative or zero");
    }

}