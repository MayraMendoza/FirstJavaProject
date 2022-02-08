package com.careerdevs;

/**
 * What is recursive method ?
 * it's a method that calls itself.
 * with each method call the problem is going to become simpler.
 * must have a condition that leads to the method no longer to call on itself.
 */

public class Recursion {
    public static void main(String[] args) {

        System.out.println( sum(5));

    }
    public static int sum(int n ){
        if (n == 0){
            return 0;

        }else{
            return (n + sum(n-1));
            // this is saying return number plus (call function number -1 )
            //this recursion will continue until n is equal to 0.

        }

    }
}
