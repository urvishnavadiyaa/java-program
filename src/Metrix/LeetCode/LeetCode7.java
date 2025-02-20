package Metrix.LeetCode;

import java.util.Collections;
import java.util.List;

public class LeetCode7 {
    public static void main(String[] args) {
        int mat[][]={{1,10,4,2},
                    {9,3,8,7},
                    {15,16,17,12}};
        int m=mat.length;
        int n=mat[0].length;
//        List<Integer> list = Collections.singletonList(1);
        for(int i=0;i<m;i++) {
            int min=Integer.MAX_VALUE;
            int idx=0;
            for(int j=0;j<n;j++) {
                if(mat[i][j] < min) {
                    idx=j;
                    min = mat[i][j];
                }
            }
            int k=0;
            int idx2=0;
            int max=Integer.MIN_VALUE;
            while(k != m) {
                if(mat[k][idx] > max) {
                    max = mat[k][idx];
                    idx2=i;
                }
                k++;
            }

            if(min == max) {
                System.out.println(mat[idx2][idx]);
                break;
            }
        }
    }
}
