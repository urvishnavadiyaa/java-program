package Arrays.asgmnt2;

public class Array1 {
    public static void main(String[] args) {
        int arr[]={58,3,17,9,6,13};
        int n=arr.length;
        for(int i=0;i<n;i++) {
            if(i == n-1) {
                System.out.print("-1 ");
                break;
            }
            for(int j=i+1;j<n;j++) {
                if(arr[i] < arr[j]) {
                    System.out.print(arr[j]+" ");
                    break;
                }
                if(j == n-1) {
                    System.out.print("-1 ");
                }
            }
        }
    }
}
