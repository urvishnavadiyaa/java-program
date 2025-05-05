package Hashing.LeetCode;
import java.util.Arrays;
import java.util.HashMap;

public class LeetCode2295 {
    public static void main(String[] args) {
        int[] num = {1,2};
        int[][] operation = {{1,3},
                            {2,1},
                            {3,2}};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
                map.put(num[i],i);
        }
        for (int i = 0; i < operation.length; i++) {
            if (map.containsKey(operation[i][0])) {
                num[map.get(operation[i][0])] = operation[i][1];
                map.put(operation[i][1], map.get(operation[i][0]));
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
