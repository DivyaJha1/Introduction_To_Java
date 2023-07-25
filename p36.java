package Patterns;

import java.util.Scanner;

public class p36 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i=1;i<=n;i++){
            int x=1;
            for (int j=1;j<=n;j++){
                if(i+j<=n){
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

    123
    12
    1

     */
}
