package Arrays.leetcode;

public class LeetCode7 {
    public static void main(String[] args) {
        int arr[]={1,2,5,4,5};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++) {
            int count=0;
            if(arr[i] == -1) {
                continue;
            }
            for(int j=i+1;j<n;j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    arr[j] = -1;
                }
            }
            if(count == 0) {
                sum=sum+arr[i];
            }
        }
        System.out.println(sum);
    }
}
