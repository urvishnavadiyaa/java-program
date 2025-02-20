package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] ={2,5,7,9,12,17,20,23,27,29,33,37,55};
        int n=arr.length;
        int i=0,j=n-1;
        int key=33;
        while(i <= j) {
            int mid = (i+j)/2;
            if(key == arr[mid]) {
                System.out.println(arr[mid]);
                return;
            }
            if(key > arr[mid]) {
                i=mid+1;
            }
            else {
                j=mid-1;
            }
        }
        System.out.println("not found");
    }
}
