package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = input.nextLine();
        count(string);
    }

    public static void count(String string) {
        char[] ch = string.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isDigit(ch[i])) {
                num++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;
            } else {
                other++;
            }
        }

        System.out.println("The string is: " + string);
        System.out.println("The no. of letters: " + letter);
        System.out.println("The no. of spaces: " + space);
        System.out.println("The no. of numbers: " + num);
        System.out.println("The no. of other char: " + other);
    }

}

/*
Difference between length and length() : 
length - used only for arrays
length() - used for strings
*/
