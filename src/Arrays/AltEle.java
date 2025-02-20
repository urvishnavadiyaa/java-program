package Arrays;

public class AltEle {
    public static void main(String[] args) {
        int arr[] ={10,20,30,40,50};
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            if(i%2 == 0) {
                System.out.print(arr[i]+ " ");
            }
        }
    }
}
