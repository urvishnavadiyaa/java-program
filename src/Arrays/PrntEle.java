package Arrays;

public class PrntEle {
    public static void main(String[] args) {
        int arr[] ={10,20,30,40,50};
        int n = arr.length;
        int a = 3;
        for(int i=0;i<=n;i++)
        {
            if(i == a) {
                System.out.print(arr[i-1]);
                return;
            }
        }
        System.out.println("index out of bound");
    }
}
