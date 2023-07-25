package Patterns;

import java.util.Scanner;

public class p27 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int l=1;
        for (int i=1;i<=n;i++){
            System.out.print("*");
            int x=i;
            for (int j=2;j<=i;j++){
                if(i>=j){
                    System.out.print(i-1);
                }
                else {
                    System.out.print(j-i-1);
                }
                x++;

            }
            if (i>1){
                System.out.print("*");}
            System.out.println();
        }
    }
    /*
    n=4

    *
    *1*
    *22*
    *333*


     */
}
