package Arrays.leetcode;

public class EvenSumDiff {

    public static void main(String[] args) {
        int arr[]={2,4,6,8};
        int left=0;
        int sum=0;
        int count =0;
        for(int i=0;i<arr.length;i++) {
            sum=sum+arr[i];
        }
        for(int i=0;i<arr.length-1;i++) {
            left=left + arr[i];
            sum=sum-arr[i];
            if(Math.abs(left-sum) % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
