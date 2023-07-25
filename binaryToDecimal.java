package OperatorsAndForLoops;

import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ans = 0;
        int a=0;
        while (n>0) {
            int z = (int) Math.pow(2, a);
            a++;
            if (n % 10 == 0) {
                n = n / 10;
                continue;
            } else {
                ans += z;
                n=n/10;
            }
        }
        System.out.println(ans);

    }

    /*
    Given a binary number as an integer N, convert it into decimal and print.
Input format :
An integer N in the Binary Format
Output format :
Corresponding Decimal number (as integer)
Constraints :
0 <= N <= 10^9
Sample Input 1 :
1100
Sample Output 1 :
12
Sample Input 2 :
111
Sample Output 2 :
7
     */
}
