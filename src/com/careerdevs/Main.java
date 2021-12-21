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
        a = "something" + " " + a;
        return a;
    }
    //https://edabit.com/challenge/KWRQP86jxzM9SZmRM
    //6. Create a function that reverses a boolean value.
    public static boolean reverse(boolean b) {
        if (b == true){
            b = false;
        }
        else{
            b = true;
        }
        return b;
    }
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


}
