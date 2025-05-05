package Recursion.assignment;

public class ass4 {
    public static void main(String[] args) {
        int[] arr = {5,7,3,5,2,6,9,5,3};
        sumarr(arr , 0);
    }

    private static int sumarr(int[] arr, int i) {
        if (i == arr.length) {
            return 0;
        }
        System.out.print(arr[i]+" ");
        return sumarr(arr, i+1);
    }
}
