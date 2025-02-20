package Arrays;

public class LargestSum {
    public static void main(String[] args) {
        int arr[]={2,4,-7,6,-3,5,9,-8,-7};
        int i=0;
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        while(i != arr.length) {
            sum =sum+arr[i];
            maxsum=Math.max(maxsum,sum);
            if(sum < 0) {
                sum=0;
            }
            i++;
        }
        System.out.println(maxsum);
    }
}
