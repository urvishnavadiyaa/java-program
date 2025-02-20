package Arrays;

public class PairSumN {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,9,11};
        int sum=1;
        int i=0;
        int j=arr.length-1;
        while(i<=j) {
            if(arr[i] + arr[j] == sum) {
                System.out.println("present");
                return;
            }
            if(arr[i] + arr[j] > sum) {
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("not present");
    }
}
