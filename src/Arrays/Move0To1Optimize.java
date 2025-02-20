package Arrays;

import java.util.Arrays;

public class Move0To1Optimize {
    public static void main(String[] args) {
        int arr[] = {1,0,1,1,1,0,0,1,0};
        int i=0,j=arr.length-1;
        while(i<j) {
            if(arr[i] != 0 && arr[j] != 1) {
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
                j--;
            }
            else if(arr[i] == 0) {
                i++;
            }
            else if(arr[j] == 1) {
                j--;
            }
            else {
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
