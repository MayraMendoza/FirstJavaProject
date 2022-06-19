package com.careerdevs.hackerRankDailyPractice;

import java.util.Scanner;

public class HackerRankDailyPractice {
    public static void main(String[] args) {
        //1. practice printing to stdout
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");

        //2. Java Stdin (standard input) and stdout(Standard output) I
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        // 3.
        /**
         Test your knowledge of using if-else conditional statements to automate decision-making processes. An if-else statement has the following logical flow:
         Given an integer, , perform the following conditional actions:
         If  is odd, print Weird
         If  is even and in the inclusive range of  to , print Not Weird
         If  is even and in the inclusive range of  to , print Weird
         If  is even and greater than , print Not Weird
         Complete the stub code provided in your editor to print whether or not  is weird.
         **/
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


//        scanner.close();
        String whatIs = null;
        if (N % 2 == 0) {
            if (2 <= N && N <= 5) {
                whatIs = "Not Weird";

            } else if (6 <= N && N <= 20) {
                whatIs = "Weird";
            } else if (N > 20) {
                whatIs = "Not Weird";
            }
        } else if (N % 2 != 0) {
            whatIs = "Weird";
        }
        System.out.println(whatIs);


        // 4.Java Stdin and Stdout II
        // in this challenge, you must read an integer, a double, and a String from stdin, then print the values


        int e = scanner.nextInt();
        Double d = scanner.nextDouble();
        scanner.nextLine();
        String s = scanner.nextLine();
        // String a = scan.nextLine();

        // s= s+a;

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + e);
//
        //5.Java output formatting

        // formatting -15 is the space in the first chunck
        // %03d meaning that 3 decimals will be present at all times - 009 - 099 -999
        //%n ,prints new line if not put then it will all print out on the same line with lots of spaces inbetween.

        System.out.println("================================");
        for (int j = 0; j < 3; j++) {
            String s1 = scanner.next();
            int x = scanner.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");


        //6.loops
        System.out.println("Please enter a number 1-20 inclusive ");

        int q = scanner.nextInt();



        for(int j =1; j<=10; j++){
            // int answer = N*i;
            System.out.println(q +" x " +j + " = " + (q*j) );
        }
    }




    }




