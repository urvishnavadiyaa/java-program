package Stack.LeetCode;

import java.util.Arrays;

public class LeetCode739 {
    public static void main(String[] args) {
        int arr[]={30,40,50,60};
        int i=0;
        int j=i+1;
        while (i < arr.length && j < arr.length) {
            while (i <= arr.length-1 && arr[j] <= arr[i]) {
                if (i == arr.length-1 || j == arr.length-1) {
                    arr[i] = 0;
                    break;
                }
                j++;
            }
            if (j == arr.length-1) {
                i++;
                j=i;
            } else {
                arr[i] = j-i;
                i++;
                j=i+1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
