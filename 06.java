package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("First number: ");
        int a = input.nextInt();

        System.out.println("Second number: ");
        int b = input.nextInt();

        System.out.println("Third number: ");
        int c = input.nextInt();

        int average = (a + b + c) / 3;

        System.out.println("The average of the three numbers entered: " + average);
    }
}
