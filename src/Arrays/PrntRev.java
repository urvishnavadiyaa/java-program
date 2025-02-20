package Arrays;

public class PrntRev {
    public static void main(String[] args) {
        int arr[] ={10,20,30,40,50};
        int n = arr.length;
        for(int i=n-1;i>=0;i=i-2)
        {
            System.out.print(" "+arr[i]);
        }
    }
}
