package Patterns;

import java.util.Scanner;

public class p24 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        for (int row=1;row<=n;row++){
            sum+=row;
            for (int curCol=1; curCol<=row;curCol++){
                System.out.print(curCol);
                if (curCol==row){
                    System.out.print("=");
                }
                else {
                    System.out.print("+");
                }
            }
            System.out.print(sum);
            System.out.println();
        }

    }
    /*
    n=4

    1=1
    1+2=3
    1+2+3=6
    1+2+3+4=10

     */
}
