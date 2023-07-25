package Arrays;

public class insertionSort {
    public static void insertionSort(int[] arr) {
        //Your code goes here
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            for (; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];


            }
            arr[j + 1] = key;
        }
    }

    /*

    Sample Input 1:
    5
    9 3 6 2 0
    Sample Output 1:
    0 2 3 6 9
    Sample Input 2:
    4
    4 3 2 1
    Sample Output 2:
    1 2 3 4
    Constraints :
    0 <= N <= 10^3
    0 <= arr[i] <= 10^5
    Time Limit: 1 sec

     */
}
