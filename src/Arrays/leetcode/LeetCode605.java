package Arrays.leetcode;

public class LeetCode605 {
    public boolean canPlaceFlowers(int[] arr, int n) {
        int fst = 0;
        int sec = fst + 1;
        int trd = sec + 1;

        if (n == 0) return true;
        if (arr.length == 1 && arr[0] == 0 && n == 1) return true;
        if (arr.length == 1 && arr[0] == 1 && n == 1) return false;

        if (arr.length >= 2 && arr[fst] == 0 && arr[sec] == 0) {
            arr[fst] = 1;
            n--;
        }

        if (arr.length >= 2 && arr[arr.length - 1] == 0 && arr[arr.length - 2] == 0) {
            arr[arr.length - 1] = 1;
            n--;
        }

        while (fst < arr.length && sec < arr.length && trd < arr.length) {
            if (arr[fst] == 0 && arr[sec] == 0 && arr[trd] == 0) {
                arr[sec] = 1;
                n--;
                fst = trd;
                sec = fst + 1;
                trd = sec + 1;
            } else {
                fst++;
                sec = fst + 1;
                trd = sec + 1;
            }
        }

        return n <= 0;
    }

    public static void main(String[] args) {
        LeetCode605 obj = new LeetCode605();

        int[] arr = {0, 0, 1, 0, 0};
        int n = 2;

        boolean result = obj.canPlaceFlowers(arr, n);
        System.out.println("Can place " + n + " flowers: " + result);
    }
}
