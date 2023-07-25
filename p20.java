package Patterns;

import java.util.Scanner;

public class p20 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");

            }
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            int z=i-1;
            for (int j=2;j<=i;j++){
                System.out.print(z);
                z--;
            }
            System.out.println();

        }
    }
    /*

    n=4

       1
      121
     12321
    1234321

     */
}
