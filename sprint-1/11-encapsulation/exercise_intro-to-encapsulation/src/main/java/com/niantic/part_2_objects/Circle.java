package com.niantic.part_2_objects;

public class Circle
{ private int Radius;

    public Circle() {

    }

    public Circle(int Radius) {
        this.Radius = Radius;
    }
        public int getRadius(){return Radius;}
        public void setRadius(int Radius){this.Radius = Radius;}

        public double getArea(){return Math.PI * Math.pow(Radius, 2);}

        public double getCircumference(){return 2 * Math.PI * Radius;}

        public int getDiameter(){return 2 * Radius;}

    }

