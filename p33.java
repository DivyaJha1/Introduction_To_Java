package Patterns;

import java.util.Scanner;

public class p33 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i=1;i<=n;i++){
            char x=(char) ('A'+n-i);
            for (int j=1;j<=i;j++){
                System.out.print(x);
                x++;
            }
            System.out.println();

        }
    }
    /*
        n=4

        D
        CD
        BCD
        ABCD

     */
}
