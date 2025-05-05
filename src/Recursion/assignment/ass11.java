package Recursion.assignment;
import java.util.HashMap;

public class ass11 {
    public static void main(String[] args) {
        int n = 8;
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println(findNthFibonacci(n, map));
    }

    private static int findNthFibonacci(int n, HashMap<Integer, Integer> map) {
        if (n == 1) return 0;
        if (n == 2) return 1;

        if (map.containsKey(n)) {
            return map.get(n);
        }
        int ans = findNthFibonacci(n - 1, map) + findNthFibonacci(n - 2, map);
        map.put(n, ans);
        return ans;
    }

}
