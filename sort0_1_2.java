package Arrays;

public class sort0_1_2 {
    public static void sort012(int[] arr){
        //Your code goes here
        int zero=0,one=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }
            if(arr[i]==1){
                one++;
            }

        }
        for(int i=0;i<zero;i++){
            arr[i]=0;
        }
        for(int i=zero;i<one+zero;i++){
            arr[i]=1;
        }
        for(int i=one+zero;i<arr.length;i++){
            arr[i]=2;
        }
    }

    /*

    Sample Input 1:
    1
    7
    0 1 2 0 2 0 1
    Sample Output 1:
    0 0 0 1 1 2 2
    Sample Input 2:
    2
    5
    2 2 0 1 1
    7
    0 1 2 0 1 2 0
    Sample Output 2:
    0 1 1 2 2
    0 0 0 1 1 2 2

     */
}
