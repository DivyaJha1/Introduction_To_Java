package Patterns;

import java.util.Scanner;

public class p16 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        for (int i=1;i<=n;i++){
            int l=n;
            for (int j=1;j<=n;j++){
                if(i<l){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
                l--;

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
