package Arrays.leetcode;

public class LeetCode1 {
    public static void main(String[] args) {
        int num[] = {1,2,2,1};
        int k=1;
        int count=0;
        for(int i=0;i<num.length;i++) {
            for(int j=i+1;j<num.length;j++) {
                if(Math.abs(num[i] - num[j]) == k) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
