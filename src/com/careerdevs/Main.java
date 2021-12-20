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

    }

    //https://edabit.com/challenge/SquoES5RxWr4CyX6G
    // 1. Create a function that takes an array containing only numbers and return the first element.
    public static int getFirstValue(int[] arr) {
        int firstNumber = arr[0];
        return firstNumber;
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
    // Write a function that returns
    public static String giveMeSomething(String a) {
        a = "something" + " " + a;
        return a;
    }


}
