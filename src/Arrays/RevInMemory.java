package Arrays;

import java.util.Arrays;

public class RevInMemory {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int i=0,j=arr.length-1;
        while(i<j) {
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
