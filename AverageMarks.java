package Basics;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {

        /* Find Average of 3 numbers provided by user
         */
        Scanner s=new Scanner(System.in);
        String str=s.next();
        char ch=str.charAt(0);

        int a1=s.nextInt();
        int a2 = s.nextInt();
        int a3 = s.nextInt();
        int z=(a1+a2+a3)/3;
        System.out.println(ch);
        System.out.println(z);


    }

}
