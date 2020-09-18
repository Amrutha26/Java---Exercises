package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        char[] letters = input.nextLine().toCharArray();
        for(int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
    }
}

/*
Difference between println and print:
Println adds a newline whereas the cursor stays at the same position in print.
 */
