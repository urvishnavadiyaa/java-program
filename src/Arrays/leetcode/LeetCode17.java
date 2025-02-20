package Arrays.leetcode;

public class LeetCode17 {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int maxsum=0;
        int low=prices[0];
        int dif=0;
        for(int i=1;i<prices.length;i++) {
            if(prices[i] < low) {
                low = prices[i];
            }
            else {
                dif=prices[i]-low;
                maxsum=Math.max(maxsum,dif);
            }
        }
        System.out.println(maxsum);
    }
}
