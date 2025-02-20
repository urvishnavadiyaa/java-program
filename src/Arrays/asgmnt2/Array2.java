package Arrays.asgmnt2;

public class Array2 {
    public static void main(String[] args) {
        int arr[]={2,7,4,7,8,3,4,8,9,9};
        int n=arr.length;
        int count=0;
        for(int i=0;i<n-1;i++) {
            if(arr[i] == -1) {
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]) {
                    System.out.print(arr[i]+" ");
                    count++;
                    arr[j] = -1;
                    break;
                }
            }
            if(count == 2) {
                return;
            }
        }
    }
}
