package Arrays.leetcode;

public class LeetCode4 {
    public static void main(String[] args) {
        int num[]={1,1,1,1};
        int count =0;
        for(int i=0;i<num.length;i++) {
            for(int j=i+1;j<num.length;j++) {
                if(num[i] == num[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
