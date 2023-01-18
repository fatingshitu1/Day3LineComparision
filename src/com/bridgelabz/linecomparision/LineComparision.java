package com.bridgelabz.linecomparision;

import org.w3c.dom.ls.LSOutput;

public class LineComparision {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparision Computation");
        //UC1 Calculation of length
        // Calculating Length of x
        // initialization of Variables
        int x1 = 2;
        int x2 = 4;
        int y1 = 3;
        int y2 = 6;
        int length = (int) Math.sqrt((x2 - x1)) * 2 + (y2 - y1) * 2;
        System.out.println("length of 1st line is " + length);

        // calculating Length1 of y
        // initialization of Variables
        int a1 = 2;
        int a2 = 4;
        int b1 = 3;
        int b2 = 6;
        int length1 = (int) Math.sqrt((a2 - a1)) * 2 + (b2 - b1) * 2;
        System.out.println("length of 1st line is " + length);

        // UC2 to check the equality of two lines
        boolean result;
        result = length = length1;

        if (result == true) {
            System.out.println("length of lines are equal");
        } else {
            System.out.println("lines are not equal");
        }
    }
}



