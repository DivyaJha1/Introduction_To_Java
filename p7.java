package Patterns;

import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i=1;i<=n;i++){
            int k=i;
            for (int j=1;j<=i;j++){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
    /*
    n=4
    1
    23
    345
    4567

     */

}
