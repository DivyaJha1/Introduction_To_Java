package Strings;

public class removeChar {
    public static String removeAllOccurrencesOfChar(String str, char ch) {
        // Your code goes here
        String ans="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=ch){
                ans+=str.charAt(i);
            }
        }
        return ans;
    }

    /*

    Sample Input 1:
    aabccbaa
    a
    Sample Output 1:
    bccb
    Sample Input 2:
    xxyyzxx
    y
    Sample Output 2:
    xxzxx

     */
}
