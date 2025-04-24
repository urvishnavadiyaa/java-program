package Hashing.LeetCode;
import java.util.HashMap;

public class LeetCode2006 {
    public static void main(String[] args) {
        int arr[] = {1,2,1,2,1,2};
        HashMap<Integer,Integer> hm = new HashMap<>();
        int k = 1;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int s1 = arr[i] + k;
            int s2 = arr[i] - k;
            if (hm.containsKey(s1)) {
                ans += hm.getOrDefault(s1 ,0);
            }
            if (hm.containsKey(s2 )) {
                ans += hm.getOrDefault(s2, 0);
            }
            hm.put(arr[i] , hm.getOrDefault(arr[i],0)+1);
        }
        System.out.println(ans);
    }
}
