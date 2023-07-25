package Arrays;

public class linearSearch {
    public static int linearSearch(int arr[], int x) {
        //Your code goes here
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
            }
        }
        return ans;
    }

    /*

    Sample Input 1:
    1
    7
    2 13 4 1 3 6 28
    3
    Sample Output 1:
    4
    Sample Input 2:
    2
    7
    2 13 4 1 3 6 28
    9
    5
    7 8 5 9 5
    5
    Sample Output 2:
    -1
    2

     */
}
