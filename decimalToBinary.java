package OperatorsAndForLoops;

import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        long n = s.nextInt();
        long ans = 0;
        long a = 0;
        while (n > 0) {
            long z = (long) Math.pow(10, a);
            a++;
            if (n % 2 == 0) {
                n = n / 2;
                continue;
            } else {
                ans += z;
                n = n / 2;
            }
        }
        System.out.println(ans);

    }
    /*
    Given a decimal number (integer N), convert it into binary and print.
Note: The given input number could be large, so the corresponding binary number can exceed the integer range. So you may want to take the answer as long for CPP and Java.
Note for C++ coders: Do not use the inbuilt implementation of "pow" function. The implementation of that function is done for 'double's and it may fail when used for 'int's, 'long's, or 'long long's. Implement your own "pow" function to work for non-float data types.


Input format :
Integer N
Output format :
Corresponding Binary number (long)
Constraints :
0 <= N <= 10^5
Sample Input 1 :
12
Sample Output 1 :
1100
Sample Input 2 :
7
Sample Output 2 :
111
     */
}
