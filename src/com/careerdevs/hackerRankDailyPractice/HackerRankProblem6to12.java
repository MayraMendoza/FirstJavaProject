package com.careerdevs.hackerRankDailyPractice;

import java.util.Scanner;

public class HackerRankProblem6to12 {
    public static void main(String []argh){
      // 7. loops II

        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

//

                for(int j=0 ; j<n; j++){

                     a += b * (int) Math.pow(2, j);
                    System.out.print(a +" ");
                }



        }
        in.close();
    }
}
