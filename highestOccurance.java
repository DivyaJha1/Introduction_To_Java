package Strings;

import java.util.HashMap;

public class highestOccurance {
    public static char highestOccuringChar(String str) {
        //Your code goes here
        HashMap<Character,Integer> hashMap= new HashMap<Character,Integer>();
        for(int i=0;i<str.length();i++){
            if(hashMap.containsKey(str.charAt(i))){
                hashMap.put(str.charAt(i), hashMap.get(str.charAt(i))+1);
            }
            else{
                hashMap.put(str.charAt(i), 1);
            }
        }

        int max=0;
        char c=' ';
        for(int i=0;i<str.length();i++){
            if(hashMap.containsKey(str.charAt(i))&& hashMap.get(str.charAt(i))>max){
                max=hashMap.get(str.charAt(i));
                c=str.charAt(i);
            }
        }
        return c;



    }
}
