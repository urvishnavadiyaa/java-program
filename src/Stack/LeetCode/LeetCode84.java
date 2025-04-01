package Stack.LeetCode;

import java.util.Stack;

public class LeetCode84 {
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        Stack<Integer> stk = new Stack<>();
        int n=arr.length;

        int i=n-1;
        int minheight=0;
        int maxheight=0;
        int totalheight=0;
        int maxwidth=0;
        while (i >= 0) {
            if (stk.isEmpty()) {
                minheight=arr[i];
                maxwidth = arr[i] * (n-i);
                stk.push(maxwidth);
            } else {
                int height=arr[i];
                if (height > minheight) {
                    totalheight=totalheight + minheight;
                } else {
                    int down=minheight-height;
                    minheight=Math.min(minheight,height);
                    totalheight=totalheight + minheight - (n-i-1) * down;
                }
                maxwidth=minheight * (n-i);
                int max= Math.max(maxheight,maxwidth);
                if (stk.peek() < max) {
                    stk.push(max);
                }
            }
            i--;
        }
    }
}
