package com.careerdevs;

import java.util.Scanner;

public class HackerRankDailyPractice {
    public static void main(String[] args) {
        //1. practice printing to stdout
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");

        //2. Java Stdin (standard input) and stdout(Standard output) I
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
