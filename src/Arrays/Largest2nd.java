package Arrays;

public class Largest2nd {
    public static void main(String[] args) {
        int[] arr = {10,7,11,16,18,14,19,5,17};
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(max1 < arr[i]) {
                max2=max1;
                max1=arr[i];
            }
            else if(max2 < arr[i] && arr[i] != max1) {
                max2=arr[i];
            }
        }
        System.out.println(max2);
    }
}
