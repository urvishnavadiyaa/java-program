package Recursion.assignment;

public class ass9 {
    public static void main(String[] args) {
        int[] arr = {5,7,2,9,3,34,325,3326,235,4535,236,655636,3};
        System.out.println(findMaxEle(arr, 0, 0));
    }

    private static int findMaxEle(int[] arr, int max, int i) {
        if (i == arr.length) {
            return max;
        }
        if (max < arr[i]) {
            max = arr[i];
        }
        return findMaxEle(arr, max, i+1);
    }
}
