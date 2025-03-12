package Arrays.leetcode;

public class LeetCode2529 {
    public static void main(String[] args) {
        int a[] = {-3,-2,-1,0,0,1,2};
        int i=0;
        int j=a.length-1;
        int cpos=0;
        int cnag=0;
        while (i <= j) {
            int mid=(i+j)/2;
            if(a[mid] < 0) {
                cnag += mid-i+1;
                i = mid+1;
            } else if(a[mid] > 0){
                cpos += j-mid+1;
                j = mid-1;
            } else {
                i = mid;
            }
        }
        int ans = Math.max(cnag,cpos);
        System.out.println(ans);
    }
}
