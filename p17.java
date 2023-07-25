package Patterns;

import java.util.Scanner;

public class p17 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        for (int i=1;i<=n;i++){
            int l=n;
            int x=1;
            for (int j=1;j<=n;j++){

                if(i<l){
                    System.out.print(" ");
                }
                else {
                    System.out.print(x);
                    x++;
                }
                l--;

            }
            System.out.println();
        }
    }
    /*
    n=4

       1
      12
     123
    1234

     */
}
