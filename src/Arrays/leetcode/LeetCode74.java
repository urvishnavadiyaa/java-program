package Arrays.leetcode;

public class LeetCode74 {
    public static void main(String[] args) {
        int arr[][] = {{1,3,5,7},
                      {10,11,16,20},
                      {23,30,34,60}};
        int m=arr.length;
        int n=arr[0].length;
        int target=34;
        int row=m-1;
        int col=0;
        while (row >= 0 && arr[row][col] > target) {
            row--;
        }
        if (row < 0) {
            System.out.println("Not Present");
            return;
        }
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[row][mid] == target) {
                System.out.println("[" + row + "," + mid + "]");
                return;
            } else if (arr[row][mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("not ..");
    }
}
