package Arrays.asgmnt1;

public class Array5 {
    public static void main(String[] args) {
        int arr[] = {1,5,11,81,91};
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n-1;i++) {
            if(arr[i] < arr[i+1]) {
                continue;
            }
            else {
                count++;
            }
        }
        if(count == 0) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
