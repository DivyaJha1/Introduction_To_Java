package Arrays;

public class checkRotation {
    public static int arrayRotateCheck(int[] arr){
        //Your code goes here
        if(arr.length==0 || arr.length==1){
            return 0;
        }
        int index=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){

                index=i+1;

                break;
            }
        }

        return index;
    }

    /*

    Sample Input 1:
    1
    6
    5 6 1 2 3 4
    Sample Output 1:
    2
    Sample Input 2:
    2
    5
    3 6 8 9 10
    4
    10 20 30 1
    Sample Output 2:
    0
    3


     */
}
