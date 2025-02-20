package Arrays;

public class ChkNum {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,70,80,90};
        int n=arr.length;
        int j=0,k=n-1;
        int m=n/2;
        while(m != n) {
            int temp = arr[k];
            arr[k] = arr[j];
            arr[j] = temp;
            j++;
            k--;
            n--;
        }

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
