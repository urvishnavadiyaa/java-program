package Arrays.leetcode;

import java.util.Arrays;

public class LeetCode9 {
    public static void main(String[] args) {

        int num[]={0,1,2,3,4};
        int index[]={0,1,2,2,1};
        int ans[]=new int[num.length];

        Arrays.fill(ans, -1);

        for (int i = 0; i < num.length; i++) {
            int pos = index[i];
            int value = num[i];

            // Shift elements to the right from the 'pos' to make space
            for (int j = num.length - 1; j > pos; j--) {
                ans[j] = ans[j - 1];
            }

            // Insert the current value at the correct position
            ans[pos] = value;
        }
        System.out.println(Arrays.toString(ans));
//
//        for(int i=0;i<idx.length;i++) {
//            int j=idx[i];
//            if(ans[j] != 0) {
//                int index=j;
//                int k = num[i];
//                int temp = ans[j];
//                ans[index] = k;
//                ans[j+1] = temp;
//                index++;
//               while (index < ans.length) {
//                   int m =temp;
//                   if(ans[j+1] != 0) {
//                       temp=ans[j+1];
//                       ans[index] = m;
//                       index++;
//                   }
//                   else {
//                       return;
//                   }
//                }
//            }
//            else {
//                ans[j] = num[i];
//            }
//        }
//        System.out.println(Arrays.toString(ans));
    }
}
