package courseTest1;

public class rectangularNumber {
    public static void print(int n) {
        //Write your code here

        int len = n * 2 - 1;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(Math.max(Math.abs(i-len/2), Math.abs(j-len/2))+1);
            }
            System.out.println();
        }
    }

    /*

    Print the following pattern for the given number of rows.
    Pattern for N = 4
    4444444
    4333334
    4322234
    4321234
    4322234
    4333334
    4444444
    Input format : N (Total no. of rows)

    Output format : Pattern in N lines

    Sample Input :
    3
    Sample Output :
    33333
    32223
    32123
    32223
    33333

     */
}
