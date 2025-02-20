package Arrays;

public class AltFromLst {
    public static void main(String[] args) {
        int arr[] ={10,20,30,40,50};
        int n = arr.length;
        for(int i=n-1;i>=0;i--)
        {
            if(i%2 == 0) {
                System.out.print(arr[i]+ " ");
            }
        }
    }
}
