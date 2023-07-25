package Arrays;

public class arraySum {
    public static int sum(int[] arr) {
        //Your code goes here
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /*

    Sample Input 1:
    1
    3
    9 8 9
    Sample Output 1:
    26
    Sample Input 2:
    2
    5
    1 2 3 4 5
    3
    10 20 30
    Sample Output 2:
    15
    60

     */
}
