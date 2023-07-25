package Arrays2D;

public class printSpiral {
    public static void spiralPrint(int matrix[][]){
        //Your code goes here
        if(matrix.length==0){
            return;
        }
        int sR=0, sC=0, eR=matrix.length, eC=matrix[0].length, count=0, totalElement=(matrix.length)*(matrix[0].length);

        while(count<totalElement){
            //top wall
            for(int i=sC; i<eC && count<totalElement ;i++){
                System.out.print(matrix[sR][i]+" ");
                count++;
            }
            sR++;

            //right wall
            for(int i=sR; i<eR && count<totalElement;i++){
                System.out.print(matrix[i][eC-1]+" ");
                count++;
            }
            eC--;

            //down wall
            for(int i=eC-1 ; i>=sC && count<totalElement ;i--){
                System.out.print(matrix[eR-1][i]+" ");
                count++;
            }
            eR--;

            //right wall
            for(int i=eR-1 ; i>=sR && count<totalElement ;i--){
                System.out.print(matrix[i][sC]+" ");
                count++;
            }
            sC++;

        }
    }

    /*

    For a given two-dimensional integer array/list of size (N x M), print it in a spiral form. That is, you need to print in the order followed for every iteration:
    a. First row(left to right)
    b. Last column(top to bottom)
    c. Last row(right to left)
    d. First column(bottom to top)
     Mind that every element will be printed only once.
    Refer to the Image:
    Spiral path of a matrix

    Input format :
    The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

    First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.

    Second line onwards, the next 'N' lines or rows represent the ith row values.

    Each of the ith row constitutes 'M' column values separated by a single space.
    Output format :
    For each test case, print the elements of the two-dimensional array/list in the spiral form in a single line, separated by a single space.

    Output for every test case will be printed in a seperate line.
    Constraints :
    1 <= t <= 10^2
    0 <= N <= 10^3
    0 <= M <= 10^3
    Time Limit: 1sec
    Sample Input 1:
    1
    4 4
    1 2 3 4
    5 6 7 8
    9 10 11 12
    13 14 15 16
    Sample Output 1:
    1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
    Sample Input 2:
    2
    3 3
    1 2 3
    4 5 6
    7 8 9
    3 1
    10
    20
    30
    Sample Output 2:
    1 2 3 6 9 8 7 4 5
    10 20 30
    
     */
}
