package Arrays.leetcode;

public class ArrayDistinct {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2,3,3,5,7};
        int i = 0;
        int j = i+1;
        int count = 0;
        while (i <= arr.length) {
            i = i + 3;
        }
        while (i < arr.length - 1) {
            
        }
//        while (i < arr.length && j != arr.length) {
//            if( arr[i] >= arr[j]) {
//                i = k + 3;
//                j = i + 1;
//                count++;
//                k = i;
//            } else {
//                i++;
//                j++;
//            }
//        }
        System.out.println(count);
    }
}
