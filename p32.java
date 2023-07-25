package Patterns;

import java.util.Scanner;

public class p32 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i=1;i<=n;i++){
            char x=(char) ('A'+i-1);
            for (int j=1;j<=i;j++){
                System.out.print(x);
                x++;
            }
            System.out.println();

        }
    }
    /*
    n=4

    A
    BC
    CDE
    DEFG

     */
}
