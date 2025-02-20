package Arrays;

public class PrntEleLast {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int last=1 ;
        int count=0;
        for(int i=arr.length;i>=0;i--) {
            if(count == last) {
                System.out.println(arr[i]);
                return;
            }
            count++;
        }
        System.out.println("index out of bound");
    }
}
