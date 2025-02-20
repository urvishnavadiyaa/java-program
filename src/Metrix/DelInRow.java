package Metrix;

public class DelInRow {
    public static void main(String[] args) {
        int arr[][] = {{2, 8, 0},
                {9, 1, 4},
                {5, 2, 6}};
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            int max = 0;
            int pos = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > max) {
                    pos = j;
                    max = arr[i][j];
                }
            }
            while (pos != n - 1) {
                arr[i][pos] = arr[i][pos + 1];
                pos++;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
