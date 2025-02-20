package Arrays;

import java.util.Arrays;

public class SwipSubArray {
    public static void main(String[] args) {
        int arr[]={12,21,33,45,57,63,78,82};
        int n = arr.length;
        int k=82;
        int arr2[] = new int[n];
        int j=0;
        while(arr[j] != k) {
            j++;
        }
        j++;
        int r=0;
        while(j != n) {
            arr2[r] = arr[j];
            r++;
            j++;
        }
        int v=r;
        for(int i=0;i<n-r;i++) {
            arr2[v] = arr[i];
            v++;
        }

        System.out.println(Arrays.toString(arr2));
    }
}
