package com.careerdevs;

/**
 * What is recursive method ?
 * it's a method that calls itself.
 * with each method call the problem is going to become simpler.
 * must have a condition that leads to the method no longer to call on itself.
 */

public class Recursion {
    public static void main(String[] args) {

        // without recursion
        System.out.println( countDown(5));
        // with recursion
        System.out.println(sum(5));

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

    public static int countDown(int n ){
        int a = 0;
        for (int i = n; i >=0; i--){
            a = a +i;
        }
        return a;
    }
}
