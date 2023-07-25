package Patterns;

import java.util.Scanner;

public class p26 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();

        for (int i = 1; i <= N; i++)
        {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 1; i < N; i++)
        {
            for (int j = i; j < N; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*
    n=4

    *
    **
    ***
    ****
    ***
    **
    *

     */
}
