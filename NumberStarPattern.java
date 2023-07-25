package Test2;

import java.util.Scanner;

public class NumberStarPattern {
    public static void main(String[] args) {

        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            int x = n - i + 1;
            for (int j = 1; j <= n; j++) {
                if (j <= x) {
                    System.out.print(j);
                } else {
                    System.out.print("*");

                }
            }
            for (int j = n; j >= 1; j--) {
                if (j <= x) {
                    System.out.print(j);
                } else {
                    System.out.print("*");

                }
            }
            System.out.println();
        }

    }
    /*

    Sample Input :5

    Sample Output :
    1234554321
    1234**4321
    123****321
    12******21
    1********1

     */
}
