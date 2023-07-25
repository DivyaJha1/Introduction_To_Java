package Patterns;

import java.util.Scanner;

public class p37 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i=n/2;i<=n;i++){
            int x=1;
            for (int j=1;j<=i;j++){
                if(i+j>=n){
                    System.out.print(x);
                    x++;
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
     1
    123
    1234

     */
}
