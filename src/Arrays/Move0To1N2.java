package Arrays;

import java.util.Arrays;

public class Move0To1N2 {
    public static void main(String[] args) {
        int arr[] = {1,0,1,1,1,0,0,1,0};
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j< arr.length;j++) {
                if(arr[i] > arr[j]) {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
