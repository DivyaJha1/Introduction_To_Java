package Test1;

import java.util.Scanner;

public class NumberStarPattern {
    public static void main(String[] args) {
        // Write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int temp1=1;
        for(int i=1;i<=n;i++){
            int temp2=n;
            for(int j=1;j<=n;j++){
                if(temp1==temp2){
                    System.out.print("*");
                    temp1++;
                }
                else{
                    System.out.print(temp2);
                }
                temp2--;
            }
            System.out.println();
        }

    }

    /*
    Sample Input :
     5
    Sample Output :
     5432*
     543*1
     54*21
     5*321
     *4321
     */
}
