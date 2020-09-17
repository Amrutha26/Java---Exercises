package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        System.out.println("The perimeter of a circle is " + perimeter);
        double area = Math.PI * radius * radius;
        System.out.println("The area of a circle is " + area);
    }
}
