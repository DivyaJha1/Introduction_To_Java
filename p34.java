package Patterns;

import java.util.Scanner;

public class p34 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if(i+j>n){
                    System.out.print('*');
                }
                else {
                    System.out.print(' ');
                }


            }
            System.out.println();

        }
    }
    /*
    n=4

       *
      **
     ***
    ****

     */
}
