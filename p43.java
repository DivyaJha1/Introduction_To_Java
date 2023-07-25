package Patterns;

public class p43 {
    // print all subArray
    public static void main(String[] args) {
        int [] arr={1,2,3};
        for(int i=0;i<arr.length;i++){
            print(arr,i);
        }
    }

    public static void print(int arr[],int start){
        for(int i=start;i<arr.length;i++){
            for(int j=start;j<=i;j++){
                System.out.print(arr[j]);
            }
            System.out.println();
        }

    }
}
