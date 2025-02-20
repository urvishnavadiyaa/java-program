package Arrays;

public class PairSumNlogn {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,9,11};
        int sum=15;
        for(int i=0;i<arr.length-1;i++) {
            int j=i+1;
            int k=arr.length-1;
            while(j<=k) {
                int mid = (j+k)/2;
                if(arr[i] + arr[mid] == sum) {
                    System.out.println("present");
                    return;
                }
                if(arr[i] + arr[mid] < sum) {
                    j=mid+1;
                }
                else{
                    k=mid-1;
                }
            }
        }
        System.out.println("not present");
    }
}
