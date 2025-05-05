package Recursion.assignment1;

public class ass5 {
    public static void main(String[] args) {
        int[] arr = {2,4,7,9,13,23,25,27,56};
        System.out.println(binarysearch(arr, 0 , arr.length-1, 56));
    }

    private static int binarysearch(int[] arr, int left, int right, int find) {
        if (left > right) {
            return -1;
        }
        int mid = (left+right) / 2;
        if (arr[mid] == find) {
            return mid;
        } else if (arr[mid] < find) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
        return binarysearch(arr, left, right, find);
    }
}
