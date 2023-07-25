package Arrays;

public class sort0_1 {
    public static void sortZeroesAndOne(int[] arr) {
        //Your code goes here
        int zero = 0;
        int one = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero++;
            } else {
                one++;
            }
        }

        for (int i = 0; i < zero; i++) {
            arr[i] = 0;
        }
        for (int i = zero; i < arr.length; i++) {
            arr[i] = 1;
        }

    }

    /*

    Sample Input 1:
    1
    7
    0 1 1 0 1 0 1
    Sample Output 1:
    0 0 0 1 1 1 1
    Sample Input 2:
    2
    8
    1 0 1 1 0 1 0 1
    5
    0 1 0 1 0
    Sample Output 2:
    0 0 0 1 1 1 1 1
    0 0 0 1 1

     */
}
