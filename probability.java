package Test2;

public class probability {
    public static int probability(int n,int x){

        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */


        int fact = (factorial(4)*100) / (factorial(x) * factorial(4 - x));
        int fact1 = (factorial(8)*100) / (factorial(n) * factorial(8 - n));
        int fact2 = (factorial(4)*100) / (factorial(n-x) * factorial(4+x - n));




        return (fact*fact2)/fact1;

    }

    public static int factorial(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }

    /*

    An urn contains 8 balls : 4 red , 2 blue and 2 green. Now n balls are drawn out of the urn. Calculate the probability that out of n drawn balls exactly x balls are red.
        Find your answer multiplied by 100 and return the integer part.
        All required values for computation will be in integer range.
        x is always less than equal to 4 and x is always less than equal to n.
        Input format :
        Two spaced integers : n and x
        Output format :
        Integer part of (Probability * 100).
        Sample Input 1 :
        3 1
        Sample Output 1:
        42
     */
}
