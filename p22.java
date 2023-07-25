package Patterns;

import java.util.Scanner;

public class p22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            int x=i;
            for (int j = 1; j <= i; j++) {
                System.out.print(x);
                x++;

            }
            int y=2*i-2;
            for (int j = 2; j <= i; j++) {

                System.out.print(y);
                y--;
            }

            System.out.println();

        }
    }
    /*
    n=4

       1
      232
     34543
    4567654

     */
}
