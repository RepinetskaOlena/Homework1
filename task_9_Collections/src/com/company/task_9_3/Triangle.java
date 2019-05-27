package com.company.task_9_3;

import java.util.Arrays;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle() {
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        if (checkTriangleNotExist(x1, y1, x2, y2, x3, y3)) {
            throw new IllegalArgumentException("Your triangle doesn't exist with the parameters" +
                    " (" + x1 + ";" + y1 + "),(" + x2 + ";" + y2 + "),(" + x3 + ";" + y3 + "), ");
        } else {
            this.a = new Point(x1, y1);
            this.b = new Point(x2, y2);
            this.c = new Point(x3, y3);
        }
    }


    private static boolean checkTriangleNotExist(double x1, double y1, double x2, double y2, double x3, double y3) {
        double[] arrSide = countSides(x1, y1, x2, y2, x3, y3);
        if (arrSide[0] > 0 && arrSide[1] > 0 && arrSide[2] > 0 && (arrSide[0] + arrSide[1] > arrSide[2]) &&
                (arrSide[2] + arrSide[1] > arrSide[0]) &&
                (arrSide[0] + arrSide[2] > arrSide[1])) {
            return false;
        } else {
            return true;
        }

    }

    private static double[] countSides(double x1, double y1, double x2, double y2, double x3, double y3) {
        double[] arrSide = new double[3];
        arrSide[0] = (int) Math.sqrt((Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)));
        arrSide[1] = (int) Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        arrSide[2] = (int) Math.sqrt((Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2)));
        return arrSide;
    }

    @Override
    public String toString() {
        return "\n" + " Triangle: " +
                "a" + a +
                ", b" + b +
                ", c" + c;
    }

    public String defineTriangle(Triangle triangle) {
        double[] arrSide = countSides(triangle.a.getX(), triangle.a.getY(), triangle.b.getX(), triangle.b.getY(),
                triangle.c.getX(), triangle.c.getY());
        String res = "- triangle";
        if (arrSide[0] == arrSide[1] || arrSide[0] == arrSide[2] || arrSide[2] == arrSide[1]) {
            res += " is isosceles ";
            if  (arrSide[0] == arrSide[1] && arrSide[0] == arrSide[2] && arrSide[2] == arrSide[1]) {
                res += " is equilateral";6
            }
        }
        else if ((Math.pow(arrSide[0], 2) + Math.pow(arrSide[1], 2)) == Math.pow(arrSide[2], 2)  ||
                    (Math.pow(arrSide[1], 2) + Math.pow(arrSide[2], 2) == Math.pow(arrSide[0], 2))   ||
                    (Math.pow(arrSide[0], 2) + Math.pow(arrSide[2], 2) == Math.pow(arrSide[1], 2))) {
                    res += " has 90 degrees angle ";
                }

         else
        {
            res += " has different sides " ;
        }

        return res;
    }

}
