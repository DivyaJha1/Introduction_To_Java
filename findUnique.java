package Arrays;

public class findUnique {
    public static int findUnique(int[] arr){
        //Your code goes here

        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=ans^arr[i];
        }

        return ans;
    }

    /*
    Sample Input 1:
    1
    7
    2 3 1 6 3 6 2
    Sample Output 1:
    1
    Sample Input 2:
    2
    5
    2 4 7 2 7
    9
    1 3 1 3 6 6 7 10 7
    Sample Output 2:
    4
    10

     */
}
