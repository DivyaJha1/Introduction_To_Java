package Strings;

public class palindrome {
    public static boolean isPalindrome(String str) {
        //Your code goes here
        int i=0,j=str.length()-1;

        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }

    /*

    Sample Input 1 :
    abcdcba
    Sample Output 1 :
    true
    Sample Input 2:
    coding
    Sample Output 2:
    false

     */
}
