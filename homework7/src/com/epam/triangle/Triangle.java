package com.epam.triangle;

import com.epam.shape.Shape;

public class Triangle extends Shape {
    private int a;
    private int b;
    private int c;

    public Triangle() {
    }

    public Triangle(String color, int a, int b, int c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getC() {
        return c;
    }

    public int getB() {
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
        int a = this.a;
        int b = this.b;
        int c = this.c;
        int p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
