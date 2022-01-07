package com.careerdevs;

/*
Assignment # 4 algorithms 15-18 & bonus adding algorithms to new class
and calling them on the main class.
*/
public class AlgorithmsBonus {
    //#15 Two Makes Ten Create a function that takes two arguments. Both arguments are integers, a and b. Return true if one of them is 10 or if their sum is 10.
    //https://edabit.com/challenge/Nz6AzC4v8jyMCH2Tu
    public static boolean makesTen(int a, int b) {
        if (a == 10 || b == 10){
            return true;
        }
        else if ( a + b == 10){
            return true;
        }else {
            return false;
        }
    }

    //#16 Count Syllables Create a function that counts the number of syllables a word has.
    // Each syllable is separated with a dash -.
    //https://edabit.com/challenge/RPBqWjEa7iyo9p54F

    public static int numberSyllables(String word) {
        int count = 1;
        for (int i=0 ; i < word.length(); i++){
            if(word.charAt(i) == '-'){
                count++;
            }
        }
        return count;
    }

    //#17 Case Insensitive Comparison
    //https://edabit.com/challenge/D6Lcut2s2gEzdCPvv
    public static boolean match(String str1, String str2) {
        if (str1.equalsIgnoreCase(str2)){
            return true;
        }else{
            return false;
        }
    }

    //#18 H4ck3r Sp34k
    //https://edabit.com/challenge/wFPAkqT72h4WGEuYN
    public static String hackerSpeak(String str) {
        String newString = str.replace('a','4').replace('e','3').replace('i','1').replace('o','0').replace('s','5');
        return newString;
    }





}
