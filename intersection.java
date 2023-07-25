package Arrays;

public class intersection {
    public static void intersections(int arr1[], int arr2[]) {
        //Your code goes here
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                    arr1[i]=0;
                    arr2[j]=0;
                    break;
                }
            }
        }
    }

    /*

    Sample Input 1 :
    2
    6
    2 6 8 5 4 3
    4
    2 3 4 7
    2
    10 10
    1
    10
    Sample Output 1 :
    2 4 3
    10

    Sample Input 2 :
    1
    4
    2 6 1 2
    5
    1 2 3 4 2
    Sample Output 2 :
    2 1 2
    Explanation for Sample Output 2 :
    Since, both input arrays have two '2's, the intersection of the arrays also have two '2's. The first '2' of first array matches with the first '2' of the second array. Similarly, the second '2' of the first array matches with the second '2' if the second array.

     */
}
