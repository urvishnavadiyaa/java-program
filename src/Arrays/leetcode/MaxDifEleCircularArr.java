package Arrays.leetcode;

public class MaxDifEleCircularArr {
    public static void main(String[] args) {
        int arr[]={-5,-10,-5};
        int diff=0;
        int j=1;
//        int idx=0;
        for (int i=0;i<arr.length;i++) {
            if(i == arr.length-1) {
                j = j%arr.length;
            }
//            idx=i%arr.length;
            diff = Math.max(diff,Math.abs(arr[i]-arr[j]));
            j++;
        }
        System.out.println(diff);
    }
}
