package Arrays;

import java.util.Arrays;

public class SmallerThanEle {
    public static void main(String[] args) {
        int arr[]={1,3,8,10,9,2,7,5,3};
        int val=7;
        int count[]=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] < val) {
                count[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(count));
    }
}
