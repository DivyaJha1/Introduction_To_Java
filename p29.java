package Patterns;

import java.util.Scanner;

public class p29 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i=1;i<=n;i++){
            int x=n-i+1;
            for (int j=1;j<=n;j++){
                if(j<=x){
                    System.out.print(j);
                }
                else {
                    System.out.print("*");

                }
            }
            for (int j=n;j>=1;j--){
                if(j<=x){
                    System.out.print(j);
                }
                else {
                    System.out.print("*");

                }
            }
            System.out.println();
        }
    }
    /*
    n=4

    12344321
    123**321
    12****21
    1******1

     */
}
