package Arrays.leetcode;
import java.util.Arrays;

public class LeetCode875 {
    public static void main(String[] args) {
        int arr[] = {805306368,805306368,805306368};
        int h = 1000000000;
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        if (arr.length == 1) {
            System.out.println((arr[0]/h)+1);
            return;
        }
        if (arr.length == h) {
            System.out.println(max);
            return;
        }
        int i=1;
        int j=max;
        int ans=-1;
        while (i <= j) {
            int mid=i+(j-i)/2;
            int idx=0;
            int count=0;
            while (idx < arr.length) {
                if (arr[idx] % mid == 0) {
                    count += arr[idx] / mid;
                } else {
                    count += (arr[idx] / mid) + 1;
                }
//                idx++;
//                count += (arr[idx] + mid - 1) / mid;
                idx++;
            }
                if (count <= h) {
                    ans=mid;
                    j=mid-1;
                }
                else {
                    i=mid+1;
                }
//            if (count == h && idx == arr.length-1) {
//                continue;
//            }
//            if ((count != 0 && idx == arr.length)) {
//                j = mid - 1;
//            }
//            if (count == 0 && idx == arr.length) {
//                j--;
//                ans = Math.min(ans,mid);
//            }
        }
        System.out.println(ans);
        System.out.println(max/min);
        System.out.println(h);
        System.out.println(min);
        System.out.println(max);
    }
}
