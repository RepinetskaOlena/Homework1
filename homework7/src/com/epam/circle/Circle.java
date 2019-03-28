package com.epam.circle;

import com.epam.shape.Shape;

public class Circle extends Shape {
    private int radius;

    public Circle() {}


    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return super.toString() +
                ": radius=" + radius;
    }


    @Override
    public double calcArea() {
        final double PI = 3.14;
        int radius = this.radius;
        return radius*radius*PI;
    }


}
