package OperatorsAndForLoops;

import java.util.Scanner;

public class squareRoot {
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ans = 0;
        for (int i = 1; i <= n / 2; i++) {
            if ((i * i) == n) {
                ans = i;
            } else if ((i * i) > n) {
                ans = i - 1;
                break;
            }
        }
        System.out.println(ans);

    }
    /*
    Given a number N, find its square root. You need to find and print only the integral part of square root of N.
For eg. if number given is 18, answer is 4.
Input format :
Integer N
Output Format :
Square root of N (integer part only)
Constraints :
0 <= N <= 10^8
Sample Input 1 :
10
Sample Output 1 :
3
Sample Input 2 :
4
Sample Output 2 :
2
     */
}
