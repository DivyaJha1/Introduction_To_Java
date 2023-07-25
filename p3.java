package Patterns;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int x=s.nextInt();
        for (int i=1;i<=x;i++){
            for (int j=1;j<=x;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    /*
    n=4

    1234
    1234
    1234
    1234

     */
}
