package Patterns;

import java.util.Scanner;

public class p41 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                if(j<i){
                    System.out.print("*");
                }
                else{
                    System.out.print(n-j+1);
                }

            }
            for(int j=1;j<=n;j++){
                if(j<i){
                    System.out.print("*");
                }
                else{
                    System.out.print(n-j+1);
                }

            }


            System.out.println();
        }
    }
    /*
    n=4

    12344321
    123**321
    12****21
    1******1

     */
}
