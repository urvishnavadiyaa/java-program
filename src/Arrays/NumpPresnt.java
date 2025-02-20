package Arrays;

public class NumpPresnt {
    public static void main(String[] args) {
        int arr[] ={10,20,40,30,40,50};
        int n = arr.length;
        int num = 40;
        for(int i=0;i<n;i++) {
            if (arr[i] == num) {
                System.out.print("present");
                return;
            }
        }
        System.out.print("not present");
    }
}

