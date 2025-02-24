package Arrays.leetcode;

public class SubArrSum {
    public static void main(String[] args) {
        int arr[] = {3, 4, 7, -2, -3, 1, 4, 2, 1};
        int count = 0;
        int k = 7;
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            if (sum == k) {
                count++;
            }
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

