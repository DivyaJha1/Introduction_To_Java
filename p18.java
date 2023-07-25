package Patterns;

import java.util.Scanner;

public class p18 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i=1;i<=n;i++){
            int x=n-i+1;
            for (int j=1;j<=n-i+1;j++){
                System.out.print(x);

            }
            System.out.println();

        }
    }
    /*
    n=4

    4444
    333
    22
    1


     */
}
