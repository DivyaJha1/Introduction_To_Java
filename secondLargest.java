package Arrays;
import java.util.*;

public class secondLargest {
    public static int secondLargestElement(int[] arr) {
        //Your code goes here
        if(arr.length==1 || arr.length==0 ){
            return -2147483648;
        }
        else{
            Arrays.sort(arr);
            int large = arr[arr.length - 1];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == large) {
                    arr[i] = -2147483648;
                }
            }
            Arrays.sort(arr);
            return arr[arr.length - 1];
        }


    }
    /*

    Sample Input 1:
    5
    4 3 10 9 2
    Sample Output 1:
    9
    Sample Input 2:
    7
    13 6 31 14 29 44 3
    Sample Output 2:
    31

     */


}
