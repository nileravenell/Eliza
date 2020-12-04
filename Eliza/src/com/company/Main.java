package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, Let's chat! I am Eliza, what's your name? ");
        String name = input.nextLine();

        System.out.println("Nice to meet you " + name + " ,how is your day going?");
        String day = input.nextLine();

        System.out.println("Why is it " + day + "?");
        String because = input.nextLine();

        System.out.println("Good talk. Have a great day!");

        System.out.println("Here are your responses:" + name + " " + day + " " + because);
    }
}
