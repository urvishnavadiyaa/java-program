package Arrays;

public class Lstele {
    public static void main(String[] args) {
        int arr[] ={10,20,30,40,50};
        int n = arr.length;
        int a = 1;
        for(int i=n;i>=0;i--)
        {
            if(i == n-a) {
                System.out.print(arr[i]);
            }
        }
    }
}
