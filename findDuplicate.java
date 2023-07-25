package Arrays;
import java.util.*;

public class findDuplicate {
    public static int duplicateNumber(int arr[]) {
        //Your code goes here
        Arrays.sort(arr);
        int ans=0;
        for (int i=0;i<arr.length-1;i++){
            if((arr[i]^arr[i+1])==0){
                ans=arr[i];
            }
        }
        return ans;

    }
    /*

    Sample Input 1:
    1
    9
    0 7 2 5 4 7 1 3 6
    Sample Output 1:
    7
    Sample Input 2:
    2
    5
    0 2 1 3 1
    7
    0 3 1 5 4 3 2
    Sample Output 2:
    1
    3

     */
}
