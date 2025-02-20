package Arrays;

import java.util.Arrays;

public class Move0To1CountN {
    public static void main(String[] args) {
        int arr[] = {1,0,1,1,1,0,0,1,0};
        int count=0;
        for(int i=0;i< arr.length;i++) {
            if(arr[i] != 1) {
                count++;
            }
        }
        for(int i=0;i<arr.length;i++) {
            if(i < count) {
                arr[i] = 0;
            }
            else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
