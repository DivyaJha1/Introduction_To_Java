package Patterns;

import java.util.Scanner;

public class p30 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        for (int i=1;i<=n;i++){
            int a=i;
            for (int j=1;j<=n;j++){
                if (a==j){
                    System.out.print("*");
                    a++;
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    /*
    n=4

    ****
    0***
    00**
    000*

     */
}
