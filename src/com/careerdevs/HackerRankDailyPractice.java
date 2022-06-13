package com.careerdevs;

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


        scanner.close();
        String whatIs = null;
        if (N % 2 == 0){
            if(2<=N && N<=5 ){
                whatIs = "Not Weird";

            }else if(6<=N && N<=20){
                whatIs = "Weird";
            }else if(N> 20){
                whatIs = "Not Weird";
            }
        }
        else if (N%2 != 0){
            whatIs = "Weird";
        }
        System.out.println(whatIs);
    }
}

