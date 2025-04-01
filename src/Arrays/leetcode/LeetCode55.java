package Arrays.leetcode;

public class LeetCode55 {
    public static void main(String[] args) {
        int arr[]={0};
        if (arr[0] == 0 && arr.length == 1) {
            System.out.println("false");
            return;
        }
        int i=0;
        while (i < arr.length) {
            if (arr[i] == 0) {
                System.out.println("false");
                return;
            } else {
                i += arr[i];
                if (i == arr.length) {
                    System.out.println("true");
                        return;
                }
            }
        }
        System.out.println("true");
    }
}
