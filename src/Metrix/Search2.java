package Metrix;

public class Search2 {
    public static void main(String[] args) {
        int matrix[][]={{1,4,6,8},
                        {10,14,17,18},
                        {25,27,28,30},
                        {34,39,47,52}};

        int m = matrix.length;
        int n = matrix[0].length;
        int k = 28;

        int row = -1;
        int left = 0, right = m - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (matrix[mid][0] <= k && matrix[mid][n-1] >= k) {
                row = mid;
                break;
            } else if (matrix[mid][0] > k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (row == -1) {
            System.out.println("Not Present");
            return;
        }

        left = 0;
        right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (matrix[row][mid] == k) {
                System.out.println("Present");
                return;
            } else if (matrix[row][mid] > k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println("Not Present");
    }
}
