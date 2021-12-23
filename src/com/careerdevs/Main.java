package com.careerdevs;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello GitHub");
        // challenge 1 test
        System.out.println(getFirstValue(new int[]{1, 2, 3, 4}));
        // challenge 2 test
        System.out.println(addition(73));
        // challenge 3 test
        System.out.println(search(new int[]{2, 4, 6, 8, 10}, 8));
        // challenge 4 test
        System.out.println(convert(6));
        // challenge 5 test
        System.out.println(giveMeSomething("is cooking"));
        // challenge 6 test
        System.out.println(reverse(false));
        // challenge 7 test
        System.out.println(countWords("Is this easy mode"));
        // challenge 8 test
        System.out.println(existsHigher(new int[] {5, 3, 15, 22, 4}, 10));
        // challenge 9 test
        System.out.println(getCount("Palm"));
    }

    //https://edabit.com/challenge/SquoES5RxWr4CyX6G
    // 1. Create a function that takes an array containing only numbers and return the first element.
    public static int getFirstValue(int[] arr) {
       // int firstNumber = arr[0];
        //return firstNumber;
        return arr[0];
    }

    //https://edabit.com/challenge/Qir2pQ2Qp3uwrfJNZ
    //2. Create a function that takes a number as an argument, increments the number by +1 and returns the result
    public static int addition(int num) {
        int newNum = num + 1;
        return newNum;
    }

    //https://edabit.com/challenge/3NowS55XTdfWtKh9n
    // 3.Create a function that searches for the index of a given item in an array. If the item is present, it should return the index, otherwise, it should return -1.
    public static int search(int arr[], int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item)
                return i;
        }
        return -1;
    }

    //https://edabit.com/challenge/2t8JDxF7wLrg7yJ5E
    //4.Write a function that takes an integer minutes and converts it to seconds.

    public static int convert(int minutes) {
        int seconds = minutes * 60;
        return seconds;
    }

    //https://edabit.com/challenge/ZuoKAgmH8G2vHtLzi
    // 5. Write a function that returns

    public static String giveMeSomething(String a) {
        a = "something " + a;
        return a;
    }

    //https://edabit.com/challenge/KWRQP86jxzM9SZmRM
    //6. Create a function that reverses a boolean value.

    public static boolean reverse(boolean b) {
        if (b == true) {
            return false;
        } else {
            return true;
        }
    }
    // option 2 - not operator
    // this takes a booleans and flips it
    // return !b;


    //https://edabit.com/challenge/5LnycSd2xT4uwZCpi
    // 7.Create a method that takes a string and returns the word count. The string will be a sentence.
    // this just counts spaces -- error may occur if there are spaces after sentence ends

    public static int countWords(String s) {
        int wordCount = 1;
        // this is going through all the characters in string s (length())
        for (int i = 0 ; i < s.length(); i++){
            if(s.charAt(i)== ' ')
                wordCount++;
        }
        return wordCount;
    }

    //https://edabit.com/challenge/aWzxPLibBLJgn8AbZ
    //8. Write a function that returns true if there exists at least one number that is larger than or equal to n.

    public static boolean existsHigher(int[] arr, int n) {
        if (arr.length == 0 )
            return false;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] >= n ){
                return  true;
            }
        }
        return false;
    }

    //https://edabit.com/challenge/GBKphScsmDi9ek3ra
    //9.Create a function that takes a string and returns the number (count) of vowels contained within it.

    public static int getCount(String str) {
        int vowelsCount = 0;
        // Your code here
        for(int i=0; i< str.length(); i++){
            char letter = str.charAt(i);
            if(letter == 'a'||letter == 'e'||letter == 'i'||letter == 'o'||letter == 'u'){
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

    //https://edabit.com/challenge/8Ty2vq2YtcBp6CFc8
    // 10. Create a method that takes two integers as arguments and return their sum.
    public static int sum(int a, int b) {
        return a + b;

    }

    //https://edabit.com/challenge/5gpukjfi5rAH8MvKF
    // 11. Create a function that returns true when x is equal to y; otherwise return false.
    public static boolean isSameNum(int x, int y) {
        if(x == y){
            return true;
        }else{
            return false;
        }
    }

    //https://edabit.com/challenge/eqcCH2WbEXFLDyiQi
    // 12.Create a function that takes the age in years and returns the age in days.
    public static int calcAge(int age) {
        return age * 365;
    }

    //https://edabit.com/challenge/JAtN6KLtahAkmT3n3
    // 13. Create a function that takes a name and returns a greeting in the form of a string.
    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

    //https://edabit.com/challenge/5gPCp7v7iDWZvb4YQ
    // 14.Create a method that takes a string as its argument and returns the string in reversed order.
    public static String reverse(final String str) {
        String reversed = "";
        // need to add -1 because str length counts index 0(as 1)
        // i will be the last number. this for loop will count down
        // str.charAt will go through each character.
        for (int i = str.length() -1 ; i >= 0 ; i--){
            reversed =  reversed + str.charAt(i);
        }
        return reversed;
    }

    // --------------------BONUS ----------------------------------
    //https://edabit.com/challenge/9D39q2q9yAFCDM9da
    // You are given the length of a video in minutes. The format is mm:ss (e.g.: "02:54"). Create a function that takes the video length and return it in seconds.
    public static int minutesToSeconds(String tm) {
        // this splits at ":" index 0 will be assigned to min and index 1 will be assigned to seconds
        String minToSec []  = tm.split(":");
        int min= Integer.parseInt(minToSec[0]);
        int sec= Integer.parseInt(minToSec[1]);

        if(sec >= 60)
            return -1;
        else {
            int seconds = min *60 + sec;
            return seconds;
        }
    }
    //https://edabit.com/challenge/B4HjZbBh9yuELmjna
    // area of a triangle

    public static int triArea(int base, int height) {
        return base *height / 2;
    }

     //https://edabit.com/challenge/KnRj8TSD63JBpzDfi
    //Multiple of 100

    public static boolean divisible(int num) {
        if (num % 100 == 0){
            return true;
        } else {
            return false;
        }
    }

    //https://edabit.com/challenge/rYD9NTBmNhaPM6wx2
    // Capture the Rook

    public static boolean canCapture(String[] rooks) {
        //Two rooks can attack each other if they share the same row (letter) or column (number).
        // string will be h1 h1
        String rook1 = rooks[0];
        String rook2 = rooks[1];

        if (rook1.charAt(0) == rook2.charAt(0)|| rook1.charAt(1) == rook2.charAt(1) ){
            return true;
        }else {
            return false;
        }
    }
}
