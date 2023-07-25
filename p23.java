package Patterns;

import java.util.Scanner;

public class p23 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=1;
        for (int i=1;i<=n;i++){
            int x=k;
            for (int j=n;j>=i;j--){
                System.out.print(x);
                x+=2;

            }
            k+=2;

            for (int j=2;j<2*i;j+=2){
                System.out.print(j-1);

            }
            System.out.println();
        }
    }
    /*
    n=4

    1357
    3571
    5713
    7135

     */
}
