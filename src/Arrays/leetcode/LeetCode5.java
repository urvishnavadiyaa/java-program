package Arrays.leetcode;
import java.util.*;
public class LeetCode5 {
    public static void main(String[] args) {
       int num[] ={8,1,2,2,3};
       int num2[]=new int[num.length];
        for(int i=0;i<num.length;i++) {
            int count=0;
            for(int j=0;j<num.length;j++) {
                if(num[i] > num[j]) {
                    count++;
                }
            }
            num2[i]=count;
        }
        System.out.println(Arrays.toString(num2));
    }
}
