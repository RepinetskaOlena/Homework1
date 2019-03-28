package com.epam.triangle;

import com.epam.shape.Shape;

public class Triangle extends Shape {
    int a;
    int b;
    int c;

    public Triangle() {
    }

    public Triangle(String color, int a, int b, int c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getC() {
        return c;
    }

    public double getB() {
        return b;
    }

    @Override
    public String toString() {
        return super.toString() +
                ": a=" + a +
                ": b=" + b +
                ": c=" + c;
    }

    @Override
    public double calcArea() {
        double a = this.a;
        double b = this.b;
        double c = this.c;
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
