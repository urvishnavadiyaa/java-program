package Arrays;

public class BigNum {
    public static void main(String[] args) {
        int arr[] ={2,1,8,30,5,10};
        int n = arr.length;
        int ans = arr[0];
        for(int i=1;i<n;i++) {
            if(arr[i] > ans) {
                ans = arr[i];
            }
        }
        System.out.print(ans);
    }
}
