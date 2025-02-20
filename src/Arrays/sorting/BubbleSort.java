package Arrays.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]= {5,3,2,6,7,4,8};
        for(int i=0;i<arr.length-1;i++) {
            int min = i;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[j] < arr[min]) {
                    min=j;
                }
            }
            if(min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
