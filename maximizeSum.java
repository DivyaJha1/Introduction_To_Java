package Test3;

public class maximizeSum {
    public static long maximumSumPath(int[] arr1, int[] arr2) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, they are passed as function arguments.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        long sum1 = 0;
        long sum2 = 0;
        long result = 0;
        int ptr1 = 0;
        int ptr2 = 0;
        int len1 = arr1.length;
        int len2 = arr2.length;

        while (ptr1 < len1 && ptr2 < len2) {
            if (arr1[ptr1] < arr2[ptr2]) {
                sum1 += arr1[ptr1];
                ptr1++;
            } else if (arr1[ptr1] > arr2[ptr2]) {
                sum2 += arr2[ptr2];
                ptr2++;
            } else {
                result += Math.max(sum1, sum2) + arr1[ptr1];
                sum1 = 0;
                sum2 = 0;
                ptr1++;
                ptr2++;
            }
        }

        while (ptr1 < len1) {
            sum1 += arr1[ptr1];
            ptr1++;
        }

        while (ptr2 < len2) {
            sum2 += arr2[ptr2];
            ptr2++;
        }

        result += Math.max(sum1, sum2);
        return result;

    }

    /*

    Given 2 sorted arrays (in increasing order), find a path through the intersections that produces maximum sum and return the maximum sum.
        That is, we can switch from one array to another array only at common elements.
        If no intersection element is present, we need to take sum of all elements from the array with greater sum.
        Input Format :
         Line 1 : An integer M i.e. size of first array
         Line 2 : M integers which are elements of first array, separated by spaces
         Line 3 : An integer N i.e. size of second array
         Line 4 : N integers which are elements of second array, separated by spaces
        Output Format :
        Maximum sum value
        Constraints :
        1 <= M, N <= 10^6
        Sample Input :
        6
        1 5 10 15 20 25
        5
        2 4 5 9 15
        Sample Output :
        81
        Explanation :
        We start from array 2 and take sum till 5 (sum = 11). Then we'll switch to array at element 10 and take till 15. So sum = 36. Now, no elements left in array after 15, so we'll continue in array 1. Hence sum is 81

     */
}
