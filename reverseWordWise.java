package Strings;

public class reverseWordWise {
    public static String reverseStringWordWise(String input) {
        // Write your code here
        String str="";
        int end=input.length()-1;
        for(int i=input.length()-1;i>=0;i--){
            if(input.charAt(i)==' '){
                str+=input.substring(i+1,end+1);
                if(end==input.length()-1){
                    str+=" ";
                }
                end=i;
            }
        }
        str+=input.substring(0,end);
        return str;

    }

    /*

    Sample Input 1:
    Welcome to Coding Ninjas
    Sample Output 1:
    Ninjas Coding to Welcome
    Sample Input 2:
    Always indent your code
    Sample Output 2:
    code your indent Always

     */
}
