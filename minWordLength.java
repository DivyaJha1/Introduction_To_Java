package Test3;

public class minWordLength {
    public static String minLengthWord(String input){

        // Write your code here
        String ans="";
        int start=0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==' '){
                String s=input.substring(start,i);
                start=i+1;
                if(ans.length()==0){
                    ans=s;
                }
                else if(ans.length()>s.length()){
                    ans=s;
                }
            }
        }
        String s=input.substring(start,input.length());
        if(ans.length()>s.length()){
            ans=s;
        }
        return ans;


    }

    /*

    Given a string S (that can contain multiple words), you need to find the word which has minimum length.
    Note : If multiple words are of same length, then answer will be first minimum length word in the string.
    Words are seperated by single space only.
    Input Format :
    String S
    Output Format :
    Minimum length word
    Constraints :
    1 <= Length of String S <= 10^5
    Sample Input 1 :
    this is test string
    Sample Output 1 :
    is
    Sample Input 2 :
    abc de ghihjk a uvw h j
    Sample Output 2 :
    a

   */
}
