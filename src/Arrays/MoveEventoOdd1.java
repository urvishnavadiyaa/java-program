package Arrays;

import java.util.Arrays;

public class MoveEventoOdd1 {
    public static void main(String[] args) {
        int arr[] = {2,9,5,6,12,8,13,20};
        int arr2[] = new int[arr.length];
        int i=0,j=0,k=arr.length-1;
        while(i != arr.length) {
            if(arr[i] % 2 == 1) {
                arr2[j] = arr[i];
                j++;
            }
            else {
                arr2[k] = arr[i];
                k--;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
