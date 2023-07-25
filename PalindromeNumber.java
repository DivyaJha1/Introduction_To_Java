package Test1;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n==0 || n==1){
            System.out.println(true);
            return;
        }
        int z = 0;
        int x=n;
        while (x > 0) {
            int i = x % 10;
            z = z * 10 + i;
            x = x / 10;
        }
        boolean ans=false;
        if(n==z){
            ans=true;
        }
        System.out.println(ans);

    }
    /*

    Check whether a given number ’n’ is a palindrome number.


        Palindrome numbers are the numbers that don't change when reversed.


        Return boolean value true or false.


        Note:
        You don’t need to print anything. Just implement the given function.
        Example:
        Input: 'n' = 51415
        Output: true
        Explanation: On reversing, 51415 gives 51415.
        Input Format:
        The first and only line of the input contains the number 'n'.
        Output format:
        Return a boolean value True or False.
        Sample Input 1 :
        1032
        Sample Output 1 :
        false
        Explanation Of Sample Input 1:
        1032, on being reversed, gives 2301, which is a totally different number.
        Sample Input 2 :
        121
        Sample Output 2 :
        true
        Explanation Of Sample Input 2:
        121, on being reversed, gives 121, which is the same.
        Expected time complexity:
        The expected time complexity is O(log(n)).
        Constraints :
        1 <= n <= 10^9
        Time Limit: 1 sec
     */
}
