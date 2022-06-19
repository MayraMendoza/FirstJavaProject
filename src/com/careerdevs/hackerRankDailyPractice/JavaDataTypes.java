package com.careerdevs.hackerRankDailyPractice;

import java.util.Scanner;

public class JavaDataTypes {
    /**
    Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):

    A byte is an 8-bit signed integer.
    A short is a 16-bit signed integer.
    An int is a 32-bit signed integer.
    A long is a 64-bit signed integer.
    Given an input integer, you must determine which primitive data types are capable of properly storing that input.

         **/

    /*
    Sample Input
    5
    -150
    150000
    1500000000
    213333333333333333333333333333333333
    -100000000000000
     */
    public static void main(String []args){




        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if ( x>=-32768 && x<=32767 )System.out.println("* short");
                if ( x>= (int)(Math.pow(-2, 31))&& x<= (int)(Math.pow(2, 31)-1))System.out.println("* int");
                if( x>= (long)(Math.pow(-2, 63)) && x<= (long)(Math.pow(2, 63)-1)) System.out.println("* long");

                //  if(x>=-128 && x<=127) {System.out.println("* byte");}
                // if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE){System.out.println("* short");}
                // if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE){System.out.println("* int");}
                // if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE){System.out.println("* long");}
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
