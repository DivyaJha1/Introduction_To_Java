package Patterns;

import java.util.Scanner;

public class p28 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        for (int i=1;i<=n+1;i++){
            if(i!=1){
                System.out.print("*");
            }
            int x=0;
            for (int j=1;j<=i-1;j++){
                System.out.print(j);
                x=j;

            }
            int l=x-1;

            for (int j=2;j<=i-1;j++){
                System.out.print(l);
                l--;


            }

            System.out.print("*");
            System.out.println();
        }
        for (int i=1;i<=n;i++){
            if(i!=n) {
                System.out.print("*");
            }
            int x=0;
            for (int j=1;j<=n-i;j++){
                System.out.print(j);
                x=j;
            }
            int l=x-1;
            for (int j=1;j<=n-i-1;j++){
                System.out.print(l);
                l--;
            }
            System.out.print("*");
            System.out.println();
        }
    }
    /*

    n=4

    *
    *1*
    *121*
    *12321*
    *1234321*
    *12321*
    *121*
    *1*
    *

     */
}
