package Patterns;

import java.util.Scanner;

public class p38 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i=n;i>=0;i--){

            for (int j=1;j<=i;j++){

                System.out.print('*');


            }
            System.out.println();

        }
    }

    /*
    n=4

    ****
    ***
    **
    *


     */
}
