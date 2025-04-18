package DynamicProgramming.LeetCode;

public class LeetCode198 {
    public static int rob(int[] arr) {
        if (arr.length == 1) return arr[0];
        if (arr.length == 2) return Math.max(arr[0],arr[1]);
        arr[1] = Math.max(arr[0],arr[1]);
        for (int i = 2; i < arr.length; i++) {
            arr[i] = Math.max(arr[i]+arr[i-2],arr[i-1]);
        }
        return arr[arr.length-1];
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        System.out.println(rob(arr));
    }
}
