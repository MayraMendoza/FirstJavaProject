package com.careerdevs;

import java.util.Scanner;

public class HackerRankProblem6to12 {
    public static void main(String []argh){
        System.out.println(5^5);
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

//

                for(int j=0 ; j<n; j++){
                    a  =+ b* (2^j);
                    System.out.print(a + (2^j * b));
                    // a += b * (int) Math.pow(2, j);
                    System.out.print(a +" ");
                }



        }
        in.close();
    }
}
