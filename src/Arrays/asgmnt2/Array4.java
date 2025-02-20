package Arrays.asgmnt2;

public class Array4 {
    public static int search(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[low] <= arr[mid]) {
                if (target >= arr[low] && target < arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                if (target > arr[mid] && target <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {7, 10, 17, 22, 40, 1, 3, 5};
        int value = 3;
        int index = search(arr, value);
        if(index != -1) {
            System.out.println(index);
        }
        else {
            System.out.println("not found");
        }
    }
}
