package Arrays;

public class rotateArray {
    public static void rotate(int[] arr, int d) {
        //Your code goes here
        if(arr.length<=1){
            return;
        }
        d=d%arr.length;
        int arr1[]=new int[d];
        for(int i=0;i<d;i++){
            arr1[i]=arr[i];
        }
        for(int i=d;i<arr.length;i++){
            arr[i-d]=arr[i];
        }
        int x=arr.length-d;
        for(int i=x;i<arr.length;i++){
            arr[i]=arr1[i-x];
        }
    }

    /*

    Sample Input 1:
    1
    7
    1 2 3 4 5 6 7
    2
    Sample Output 1:
    3 4 5 6 7 1 2
    Sample Input 2:
    2
    7
    1 2 3 4 5 6 7
    0
    4
    1 2 3 4
    2
    Sample Output 2:
    1 2 3 4 5 6 7
    3 4 1 2


     */
}
