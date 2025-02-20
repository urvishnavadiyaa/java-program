package Arrays;

public class Count {
    public static void main(String[] args) {
        int arr[] ={10,20,30,40,50};
        int n = arr.length;
        int evan = 0,odd = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] % 2 == 0) {
                evan++;
            }
            else {
                odd++;
            }
        }
        System.out.print("enan is: "+ evan + " odd is: " +odd);
    }
}
