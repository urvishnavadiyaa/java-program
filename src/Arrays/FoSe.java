package Arrays;

public class FoSe {
    public static void main(String[] args) {
        int arr[] ={10,21,30,43,50};
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i] % 2 != 0) {
                System.out.print(arr[i]+" ");
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i] % 2 == 0) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
