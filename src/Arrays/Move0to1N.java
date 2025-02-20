package Arrays;

import java.util.Arrays;

public class Move0to1N {
    public static void main(String[] args) {
        int arr[] = {1,0,1,1,1,0,0,1,0};
        int arr2[]=new int[arr.length];
        int i=0,j=arr.length-1;
        for(int k=0;k< arr.length;k++) {
            if(arr[k] != 1) {
                arr2[i] =arr[k];
                i++;
            }
            else {
                arr2[j] = arr[k];
                j--;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
