package Strings;

import java.util.HashMap;

public class checkPermutation {
    public static boolean isPermutation(String str1, String str2) {
        //Your code goes here
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(int i=0;i<str1.length();i++){
            if(hashMap.containsKey(str1.charAt(i))){
                hashMap.put(str1.charAt(i), hashMap.get(str1.charAt(i))+1);
            }
            else{
                hashMap.put(str1.charAt(i), 1);
            }
        }

        for(int i=0;i<str2.length();i++){
            if(!hashMap.containsKey(str2.charAt(i))){
                return false;
            }
            if(hashMap.containsKey(str2.charAt(i)) &&  hashMap.get(str2.charAt(i))>1 ){
                hashMap.put(str2.charAt(i), hashMap.get(str2.charAt(i))-1);
            }
            else if(hashMap.get(str2.charAt(i))==1){
                hashMap.remove(str2.charAt(i));
            }

        }

        if(hashMap.size()==0){
            return true;
        }
        else{
            return false;
        }

    }
    /*

    For a given two strings, 'str1' and 'str2', check whether they are a permutation of each other or not.
    Permutations of each other
    Two strings are said to be a permutation of each other when either of the string's characters can be rearranged so that it becomes identical to the other one.

    Example:
    str1= "sinrtg"
    str2 = "string"

    The character of the first string(str1) can be rearranged to form str2 and hence we can say that the given strings are a permutation of each other.
    Input Format:
    The first line of input contains a string without any leading and trailing spaces, representing the first string 'str1'.

    The second line of input contains a string without any leading and trailing spaces, representing the second string 'str2'.
    Note:
    All the characters in the input strings would be in lower case.
    Output Format:
    The only line of output prints either 'true' or 'false', denoting whether the two strings are a permutation of each other or not.

    You are not required to print anything. It has already been taken care of. Just implement the function.
    Constraints:
    0 <= N <= 10^6
    Where N is the length of the input string.

    Time Limit: 1 second
    Sample Input 1:
    abcde
    baedc
    Sample Output 1:
    true
    Sample Input 2:
    abc
    cbd
    Sample Output 2:
    false

     */
}
