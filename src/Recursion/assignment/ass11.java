package Recursion.assignment;
import java.util.HashMap;

public class ass11 {
    public static void main(String[] args) {
        int n = 100;
        HashMap<Integer, Long> map = new HashMap<>();
        System.out.println(findNthFibonacci(n, map));
    }

    private static long findNthFibonacci(int n, HashMap<Integer, Long> map) {
        if (n == 1) return 1;
        if (n == 2) return 1;

        if (map.containsKey(n)) {
            return map.get(n);
        }
        long ans = findNthFibonacci(n - 1, map) + findNthFibonacci(n - 2, map);
        map.put(n, ans);
        return ans;
    }

}
