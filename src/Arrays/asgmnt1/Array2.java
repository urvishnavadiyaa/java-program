package Arrays.asgmnt1;

public class Array2 {
    public static void main(String[] args) {
        int arr[] = {4, 3, 6, 7, 21, 11, 15, 5};
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.print(arr[i] + " ");
            }
            count = 0;
        }
    }
}


