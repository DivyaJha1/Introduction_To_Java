package Time_Complexity;

public class pairSum {
    public static int pairSum(int[] arr, int num) {
        //Your code goes here
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==num){
                    count++;
                }
            }
        }
        return count;
    }
}
