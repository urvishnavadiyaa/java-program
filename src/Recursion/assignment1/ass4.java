package Recursion.assignment1;

public class ass4 {
    public static void main(String[] args) {
        int[] arr = {2,4,7,9,13,23,25,27,56};
        System.out.println(checkArrSorted(arr, 1));
    }

    private static boolean checkArrSorted(int[] arr, int i) {
        if (i == arr.length) {
            return true;
        }
        if (arr[i] < arr[i-1]) {
            return false;
        }
        return checkArrSorted(arr, i+1);
    }
}
