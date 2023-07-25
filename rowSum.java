package Arrays2D;

public class rowSum {
    public static void rowWiseSum(int[][] mat) {
        //Your code goes here
        for(int i=0;i<mat.length;i++){
            int sum=0;
            for(int j=0;j<mat[0].length;j++){
                sum+=mat[i][j];

            }
            System.out.print(sum+" ");
        }
    }

    /*

    Sample Input 1:
    1
    4 2
    1 2
    3 4
    5 6
    7 8
    Sample Output 1:
    3 7 11 15
    Sample Input 2:
    2
    2 5
    4 5 3 2 6
    7 5 3 8 9
    4 4
    1 2 3 4
    9 8 7 6
    3 4 5 6
    -1 1 -10 5
    Sample Output 2:
    20 32
    10 30 18 -5

     */
}
