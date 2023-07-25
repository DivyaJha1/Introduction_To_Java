package Arrays;
import java.util.*;

public class pairSum {
    public static int getPairSum(int arr[], int x) {
        //Your code goes here
        Arrays.sort(arr);
        int count=0;
        int left=0;
        int right=arr.length-1;

        while(left<arr.length && right>=0){
            if((arr[left]+arr[right])>x){
                right--;
            }
            else if(arr[left]+arr[right]<x){
                left++;
            }
            else if(arr[left]+arr[right]==x){
                count++;
                left++;
                right--;
            }
        }
        return count;

    }

    /*

    Sample Input 1:
    1
    9
    1 3 6 2 5 4 3 2 4
    7
    Sample Output 1:
    7
    Sample Input 2:
    2
    9
    1 3 6 2 5 4 3 2 4
    12
    6
    2 8 10 5 -2 5
    10
    Sample Output 2:
    0
    2


     Explanation for Input 2:
    Since there doesn't exist any pair with sum equal to 12 for the first query, we print 0.

    For the second query, we have 2 pairs in total that sum up to 10. They are, (2, 8) and (5, 5).
     */
}
