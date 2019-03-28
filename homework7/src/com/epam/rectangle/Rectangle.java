package com.epam.rectangle;

import com.epam.circle.Circle;
import com.epam.shape.Shape;

public class Rectangle extends Shape {
    int width;
    int height;
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

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calcArea() {
        double width = this.width;
        double height = this.height;
        return width*height;
    }
}
