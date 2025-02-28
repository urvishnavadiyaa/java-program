package Arrays.leetcode;

public class LeetCode724 {
    public static void main(String[] args) {
        int arr[]={1,7,3,6,5,6};
//        for (int i = 0; i < arr.length; i++) {
//            int sum1=0;
//            if(i>0) {
//                for (int j = i-1; j >=0; j--) {
//                    sum1+=arr[j];
//                }
//            }
//            int sum2=0;;
//            for (int k = i+1; k < arr.length; k++) {
//                sum2+=arr[k];
//            }
//            if(sum1==sum2) {
//                System.out.println(i);
//                return;
//            }
//        }
//        System.out.println(-1);
        int rightsum=0;
        int leftsum=0;
        for (int i = 0; i < arr.length; i++) {
            rightsum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            rightsum-=arr[i];
            if(leftsum==rightsum) {
                System.out.println(i);
                return;
            }
            leftsum+=arr[i];
        }
        System.out.println(-1);
    }
}
