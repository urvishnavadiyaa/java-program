package Arrays.asgmnt1;
import java.util.*;
public class Array3 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        int a1[]= new int[n/2];
        int a2[]= new int[n/2];
        int i=0,j=n/2;
        while(j < n) {
            a1[i] = arr[i];
            a2[i] = arr[j];
            i++;
            j++;
        }
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
    }
}
