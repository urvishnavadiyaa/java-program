package Arrays.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMetrix {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,7},
                     {4,5,6,2},
                     {7,8,9,8},
                     {2,6,2,7}};
        int m=arr.length;
        int n=arr[0].length;
//        List<Integer> l = new ArrayList<>();
        int ans[]=new int[m*n];
        int srow = 0;
        int erow = m-1;
        int scol = 0;
        int ecol = m-1;
        int c=0;
        while (srow <= erow && scol <= ecol) {
            for (int i = scol; i <= ecol; i++) {
                ans[c] = arr[srow][i];
                c++;
            }
            for (int i = srow + 1; i <= erow; i++) {
                ans[c] = arr[i][ecol];
                c++;
            }
            for (int i = ecol - 1; i >= scol; i--) {
                if(srow == erow) {
                    break;
                }
                ans[c] = arr[erow][i];
                c++;
            }
            for (int i = erow - 1; i >= srow + 1; i--) {
                if(scol == ecol) {
                    break;
                }
                ans[c] = arr[i][scol];
                c++;
            }
            srow++;
            erow--;
            scol++;
            ecol--;
        }
        System.out.println(Arrays.toString(ans));
    }
}
