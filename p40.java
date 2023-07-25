package Patterns;

import java.util.Scanner;

public class p40 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<n;i++){
            System.out.print("*");
            int x=0;
            for (int j=1;j<=n-i;j++){
                System.out.print(j);
                x++;
            }
            for (int j=x-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println("*");
        }
        System.out.print("*");
    }

    /*
    n=4
    *12321*
    *121*
    *1*
    *

     */
}
