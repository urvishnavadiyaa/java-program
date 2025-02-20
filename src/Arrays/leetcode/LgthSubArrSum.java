package Arrays.leetcode;

public class LgthSubArrSum {
    public static void main(String[] args) {
        int arr[]={7, 4, 2, 1};
        int sum=0;
        for (int i=0;i<arr.length;i++) {
            int endidx=0;
            if(i - arr[i] < 0) {
                endidx=0;
            } else {
                endidx=i-arr[i];
            }
            for (int j=i;j>=endidx;j--) {
                sum=sum+arr[j];
            }
        }
        System.out.println(sum);
    }
}
