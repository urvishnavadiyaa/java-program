package Arrays.leetcode;

public class LeetCode19 {
    public static void main(String[] args) {
        int arr[] = {3,2,3};
        int maxele=-1;
        int maxcount=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            int count=1;
            if(arr[i] == -1) {
                continue;
            }
            int curr = arr[i];
            for(int j=i+1;j<arr.length;j++) {
                if(curr == arr[j]) {
                    count++;
                    arr[j]=-1;
                }
            }
            if(maxcount < count) {
                maxcount = Math.max(maxcount,count);
                maxele=curr;
            }
        }
        System.out.println(maxele);
    }
}
