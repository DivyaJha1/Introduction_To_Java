package Patterns;

public class p44 {
    public static void main(String[] args) {
        int n=4;
        char x='A';
        for(int i=1;i<=n;i++){

            for (int j=1;j<=n;j++){
                System.out.print(x);

            }
            System.out.println();
            x++;
        }
    }
    /*
    output:
    AAAA
    BBBB
    CCCC
    DDDD

     */
}
