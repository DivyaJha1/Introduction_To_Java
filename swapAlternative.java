package Arrays;

public class swapAlternative {
    public static void swapAlternate(int arr[]) {
        //Your code goes here
        for(int i=0;i<arr.length-1;i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;

        }
    }

    /*

    Sample Input 1:
    1
    6
    9 3 6 12 4 32
    Sample Output 1 :
    3 9 12 6 32 4
    Sample Input 2:
    2
    9
    9 3 6 12 4 32 5 11 19
    4
    1 2 3 4
    Sample Output 2 :
    3 9 12 6 32 4 11 5 19
    2 1 4 3

     */
}
