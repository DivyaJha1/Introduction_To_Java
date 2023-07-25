package Strings;

public class countWords {
    public static int countWords(String str) {
        //Your code goes here
        if(str.length()==0){
            return 0;
        }
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) ==  ' ') {
                count++;
            }
        }
        return count;
    }

    /*

    Sample Input 1:
    Coding Ninjas!
    Sample Output 1:
    2
    Sample Input 2:
    this is a sample string
    Sample Output 2:
    5

     */
}
