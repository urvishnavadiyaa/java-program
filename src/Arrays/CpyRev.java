package Arrays;

import java.util.Arrays;

public class CpyRev {
    public static void main(String[] args) {
        int arr[] ={10,20,30,40,50};
        int n = arr.length;
        int arr2[] = new int[n];
        int r=0;
        for(int i=n-1;i>=0;i--) {
            arr2[r] = arr[i];
            r++;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
