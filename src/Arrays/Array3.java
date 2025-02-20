package Arrays;

public class Array3 {
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        int n=arr.length;
        int arr2[] = new int[n*2];

        for(int i=0;i<n;i++) {
            arr2[i] =arr[i];
            arr2[i+n] = arr[i];
        }
        for(int i=0;i<arr2.length;i++) {
            System.out.print(arr2[i]+ " ");
        }
    }
}
