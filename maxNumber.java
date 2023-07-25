package Test2;

public class maxNumber {
    public static int max_number(int n){

        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        int[] arr=new int[4];
        int x=n;

        for(int i=0;i<4;i++){
            arr[i]=x%10;
            x=x/10;

        }
        int ans1=(arr[3]*100)+(arr[2]*10)+(arr[1]);
        int ans2 = (arr[3] * 100) + (arr[1] * 10) + (arr[0]);
        int ans3 = (arr[3] * 100) + (arr[2] * 10) + (arr[0]);
        int ans4 = (arr[2] * 100) + (arr[1] * 10) + (arr[0]);
        int anss1=Math.max(ans1,ans2);
        int anss2 = Math.max(ans3, ans4);


        return Math.max(anss1,anss2);
    }
    /*

    We are given a 4 digit number using digits 1 to 9. What is the maximum 3 digit number that we can make by removing one digit from the given integer.
        Input Format :
        A 4 digit number
        Output Format :
        A 3 digit number
        Sample Input :
        5438
        Sample Output :
        548
        Explanation :
        1. If we remove 5, the new number is 438.
        2. If we remove 4, the new number is 538.
        3. If we remove 3, the new number is 548.
        4. If we remove 8, the new number is 543.
        Out of the 4 cases removing 3 gives us the maximum 3 digit number i.e 548
     */
}
