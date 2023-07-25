package Arrays;

public class arrangeNumbers {
    public static void arrange(int[] arr, int n) {
        //Your code goes here
        int odd = 1;
        int even = 0;
        if(n%2==0){
            even=n;
        }
        else{
            even=n-1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (odd <= n) {
                arr[i] = odd;
                odd += 2;

            }
            else {
                arr[i] = even;
                even -= 2;
            }
        }
    }

    /*

    Sample Input 1 :
    1
    6
    Sample Output 1 :
    1 3 5 6 4 2
    Explanation of Sample Input 1 :
    Since the value of N is 6, the number will be stored in the array in such a fashion that 1 will appear at 0th index, then 2 at the last index, in a similar fashion 3 is stored at index 1. Hence the array becomes 1 3 5 6 4 2.
    Sample Input 2 :
    2
    9
    3
    Sample Output 2 :
    1 3 5 7 9 8 6 4 2
    1 3 2

     */
}
