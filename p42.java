package Patterns;

import java.util.Scanner;

public class p42 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        print(n);
    }
    public static void print(int n) {
        //Write your code here
        int len = n * 2 - 1;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(Math.max(Math.abs(i-len/2), Math.abs(j-len/2))+1);
            }
            System.out.println();
        }
    }

    /*
    n=4

    4444444
    4333334
    4322234
    4321234
    4322234
    4333334
    4444444

     */
}
