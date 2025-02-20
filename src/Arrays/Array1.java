package Arrays;

public class Array1 {
    public static void main(String[] args) {
        int arr[] = {10,8,2,4,8,5,9,6,2,1,6};
        int n = arr.length;
        int arr2[] = new int[n];
//        int count[] = new int[n];
        int idx=0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(i==j) {
                    continue;
                }
                if(arr[i] > arr[j]) {
                    idx++;
                }
            }
            arr2[i] =idx;
            idx=0;
        }
        for(int i=0;i<n;i++) {
            System.out.print(arr2[i]+ " ");
        }

    }
}
