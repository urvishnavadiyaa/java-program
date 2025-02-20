package Arrays;

import java.util.Arrays;

public class MoveEventoOdd2 {
    public static void main(String[] args) {
        int arr[] = {2,9,5,6,12,8,13,20};
        int i=0,j=arr.length-1;
        while(i<j) {
            if(arr[i] % 2 != 1 && arr[j] % 2 != 0) {
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
                j--;
            }
            else if(arr[j] % 2 == 0) {
                j--;
            }
            else if(arr[i] % 2 == 1) {
                i++;
            }
            else {
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
