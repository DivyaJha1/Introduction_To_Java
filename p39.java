package Patterns;

import java.util.Scanner;

public class p39 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("*");
        for(int i=1;i<=n;i++){
            System.out.print("*");
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            for (int j=i-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println("*");
        }

    }
    /*
    n=4

    *
    *1*
    *121*
    *12321*
    *1234321*

     */
}
