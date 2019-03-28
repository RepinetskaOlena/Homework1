package com.epam.rectangle;

import com.epam.circle.Circle;
import com.epam.shape.Shape;

public class Rectangle extends Shape {
    private int width;
    private int height;
    public Rectangle (){}

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() +
                ": width=" + width +
                ": height=" + height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double calcArea() {
        int width = this.width;
        int height = this.height;
        return width*height;
    }
}
