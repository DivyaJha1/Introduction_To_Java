package Test1;

import java.util.Scanner;

public class checkAp {
    public static void main(String[] args) {
        // Write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        if(arr.length<2){
            return;
        }
        boolean inAp=true;
        for(int i=0;i<n;i++){
            if(arr[i]!=arr[0]+(i*(arr[1]-arr[0]))){
                inAp=false;
            }
        }
        System.out.println(inAp);
    }

    /*

    Given input consists of n numbers. Check whether those n numbers form an arithmetic progression or not. Print true or false.
        Input format :
        Line 1 : n
        Line 2 : n numbers
        Sample Input 1 :
        6
        2 6 10 14 18 22
        Sample Output 1 :
        true
        Sample Input 2 :
        6
        2 6 10 15 19 23
        Sample Output 2 :
        false
     */
}
