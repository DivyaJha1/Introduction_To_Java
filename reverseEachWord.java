package Strings;

public class reverseEachWord {
    public static String reverseEachWords(String str) {
        //Your code goes here
        int start=0;
        int end=0;
        String ans="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                if(start==0){
                    ans+=reverseWord(str.substring(start,i));
                }
                else{
                    ans+=reverseWord(str.substring(start+1,i));
                }

                if(i!=str.length()-1){
                    ans+=" ";
                }
                start=i;
            }
        }
        ans+=reverseWord(str.substring(start,str.length()));
        return ans;
    }

    public static String reverseWord(String str) {
        //Your code goes here
        String ans="";
        for(int i=str.length()-1;i>=0;i--){
            ans+=str.charAt(i);
        }
        return ans;
    }

    /*

    Sample Input 1:
    Welcome to Coding Ninjas
    Sample Output 1:
    emocleW ot gnidoC sajniN
    Sample Input 2:
    Always indent your code
    Sample Output 2:
    syawlA tnedni ruoy edoc

     */
}
