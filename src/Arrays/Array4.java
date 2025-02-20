package Arrays;

public class Array4 {
    public static void main(String[] args) {
        int arr1[] = {10,20,30};
        int arr2[] = {40,50,60};
        int n = arr1.length;
        int arr3[] = new int[n*2];

        for(int i=0;i<n;i++) {
            arr3[i] =arr1[i];
            arr3[i+n] = arr2[i];
        }
        for(int i=0;i<arr3.length;i++) {
            System.out.print(arr3[i]+ " ");
        }
    }
}
