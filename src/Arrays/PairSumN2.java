package Arrays;

public class PairSumN2 {
    public static void main(String[] args) {
        int arr[] = {3,7,2,5,9,11,4,6};
        int sum=15;
        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j< arr.length;j++) {
                if(arr[i] + arr[j] == sum) {
                    System.out.println("present");
                    return;
                }
            }
        }
        System.out.println("not prsent");
    }
}
