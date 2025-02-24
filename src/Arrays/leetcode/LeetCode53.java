package Arrays.leetcode;

public class LeetCode53 {
    public static void main(String[] args) {
        int arr[]= {-2,1,-3,4,-1,2,1,-5,4};
//        int i=0;
//        int j=0;
//        int maxsum=Integer.MIN_VALUE;
//        int sum = 0;
//        while (i < arr.length && j < arr.length) {
//            sum = sum + arr[j];
//            maxsum=Math.max(maxsum,sum);
//            if (sum < 0) {
//                sum = 0;
//                i=j+1;
//                j=i;
//            } else {
//                j++;
//            }
//        }
        int i=0;
//        int j=0;
        int maxsum=Integer.MIN_VALUE;
        int sum = 0;
        while (i < arr.length) {
            sum = sum + arr[i];
            maxsum=Math.max(maxsum,sum);
            if (sum < 0) {
                sum = 0;
            }
            i++;
        }

        System.out.println(maxsum);
    }
}
