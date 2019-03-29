package com.epam;

import com.epam.circle.Circle;
import com.epam.rectangle.Rectangle;
import com.epam.shape.Shape;
import com.epam.triangle.Triangle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Shape[] arrayShape = {new Rectangle("blue", 0, 1), new Rectangle("blue", 2, 2),
                new Rectangle("blue", 1, 3), new Rectangle("blue", 1, 10), new Circle("red", 3), new Circle("red", 1),
                new Circle("red", 2), new Triangle("yellow", 2, 2, 2),
                new Triangle("yellow", 1, 1, 3)};

        printShapes(arrayShape);
        System.out.println("Total square of all shapes: " + calcAllArea(arrayShape));
        System.out.println("The square of all circles, rectangles and triangles:"
                + Arrays.toString(calcEachShapeArea(arrayShape)) + " subsequently");
    }


    static double calcAllArea(Shape[] arr) {
        double sumArea = 0;
        for (Shape elem : arr) {
            if (elem instanceof Triangle) {
            if (((Triangle) elem).getA() > 0 && ((Triangle) elem).getB() > 0 && ((Triangle) elem).getC() > 0
                    && (((Triangle) elem).getA() + ((Triangle) elem).getB()) > ((Triangle) elem).getC() &&
                    (((Triangle) elem).getC() + ((Triangle) elem).getB()) > ((Triangle) elem).getA() &&
                    (((Triangle) elem).getA() + ((Triangle) elem).getC()) > ((Triangle) elem).getB()) {
                sumArea += elem.calcArea();}
            } else {
                sumArea += elem.calcArea();
            }
        }
        return sumArea;
    }


    static double[] calcEachShapeArea(Shape[] arr) {
        double[] areas = new double[3];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Circle) {
                areas[0] += arr[i].calcArea();
            } else if (arr[i] instanceof Rectangle) {
                areas[1] += arr[i].calcArea();
            } else { if ( (((Triangle) arr[i]).getA() + ((Triangle) arr[i]).getB()) > ((Triangle) arr[i]).getC() &&
                    (((Triangle) arr[i]).getC() + ((Triangle) arr[i]).getB()) > ((Triangle) arr[i]).getA() &&
                    (((Triangle) arr[i]).getA() + ((Triangle) arr[i]).getC()) > ((Triangle) arr[i]).getB()) {
                areas[2] += arr[i].calcArea();}
            }
        }
        return areas;
    }

    static void printShapes(Shape[] arr) {
        for (Shape elem : arr) {
            if (elem instanceof Circle) {
                if (((Circle) elem).getRadius() > 0) {
                    System.out.println(elem.toString() + ": square=" + elem.calcArea());
                } else {
                    System.out.println("The circle doesn't exist");
                }
            } else if (elem instanceof Rectangle) {
                if (((Rectangle) elem).getHeight() > 0 && ((Rectangle) elem).getWidth() > 0) {
                    System.out.println(elem.toString() + ": square=" + elem.calcArea());
                } else {
                    System.out.println("The rectangle doesn't exist");
                }
            } else {
                if (((Triangle) elem).getA() > 0 && ((Triangle) elem).getB() > 0 && ((Triangle) elem).getC() > 0
                        && (((Triangle) elem).getA() + ((Triangle) elem).getB()) > ((Triangle) elem).getC() &&
                        (((Triangle) elem).getC() + ((Triangle) elem).getB()) > ((Triangle) elem).getA() &&
                        (((Triangle) elem).getA() + ((Triangle) elem).getC()) > ((Triangle) elem).getB())  {
                    System.out.println(elem.toString() + ": square=" + elem.calcArea());
                } else {
                    System.out.println("The triangle doesn't exist");
                }
            }
        }
    }
}

