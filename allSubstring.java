package Strings;

public class allSubstring {
    public static void printSubstrings(String str) {
        //Your code goes here
        for(int i=0; i<str.length();i++){
            print(str.substring(i));
        }
    }

    public static void print(String str) {
        // Your code goes here
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(str.charAt(j));
            }
            System.out.println();

        }
    }

    /*

    Sample Input 1:
    abc
    Sample Output 1:
    a
    ab
    abc
    b
    bc
    c
     Sample Input 2:
    co
    Sample Output 2:
    c
    co
    o

     */
}
