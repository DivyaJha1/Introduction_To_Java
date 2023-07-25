package OperatorsAndForLoops;

import java.util.Scanner;

public class nThFibonacci {
    public static void main(String[] args) {

        /* Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        Scanner s = new Scanner(System.in);
        int j = s.nextInt();
        int fib = fibo(j);
        System.out.print(fib);


    }

    public static int fibo(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int sum = fibo(x - 2);
        return fibo(x - 1) + sum;
    }

    /*
    The n-th term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -
    F(n) = F(n - 1) + F(n - 2),
    Where, F(1) = 1, F(2) = 1


Provided 'n' you have to find out the n-th Fibonacci Number. Handle edges cases like when 'n' = 1 or 'n' = 2 by using conditionals like if else and return what's expected.


Example :
Input: 6

Output: 8

Explanation: The number is ‘6’ so we have to find the “6th” Fibonacci number.
So by using the given formula of the Fibonacci series, we get the series:
[ 1, 1, 2, 3, 5, 8, 13, 21]
So the “6th” element is “8” hence we get the output.
Input Format :
The first line contains an integer ‘n’.


Output Format :
Print the n-th Fibonacci number.
Sample Input 1:
6


Sample Output 1:
8


Explanation of sample input 1 :
The number is ‘6’ so we have to find the “6th” Fibonacci number.
So by using the given formula of the Fibonacci series, we get the series:
[ 1, 1, 2, 3, 5, 8, 13, 21]
So the “6th” element is “8” hence we get the output.


Expected time complexity :
The expected time complexity is O(n).


Constraints:
1 <= 'n' <= 10000
Where ‘n’ represents the number for which we have to find its equivalent Fibonacci number.

Time Limit: 1 second
     */
}
