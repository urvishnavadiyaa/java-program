package Arrays.leetcode;

public class ColumnIncress {
    public static void main(String[] args) {
        int arr[][]={{3,2,1},
                    {2,1,0},
                    {1,2,3}};
        int total=0;
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[j][i] <= arr[j-1][i]) {
                    int count = (arr[j-1][i] - arr[j][i]) + 1;
                    arr[j][i] = arr[j-1][i] + 1;
                    total = total + count;
                }
            }
        }
        System.out.println(total);
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
    }
}
