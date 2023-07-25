package Strings;

public class removeConsecutiveDuplicate {
    public static String removeDuplicates(String str) {
        //Your code goes here
        int i=0;
        String s=""+str.charAt(0);
        for(int j=1;j<str.length();j++){
            if(str.charAt(i)!=str.charAt(j)){
                s+=str.charAt(j);
                i=j;
            }
        }
        return s;
    }
    /*

    Sample Input 1:
    aabccbaa
    Sample Output 1:
    abcba
    Sample Input 2:
    xxyyzxx
    Sample Output 2:
    xyzx

     */
}
