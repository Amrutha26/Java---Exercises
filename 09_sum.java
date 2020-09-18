package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        int sum = 0;

        while(number != 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("The sum of the digits of the entered number: " + sum);
    }
}
