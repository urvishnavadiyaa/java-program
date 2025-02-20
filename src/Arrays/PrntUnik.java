package Arrays;

public class PrntUnik {
    public static void main(String[] args) {
        int arr[] = {2,5,8,2,3,5,7,6,6,1};
        int n=arr.length;
        int count = 0;
        for(int i=0;i<n;i++) {
            if(arr[i] == -1) {
                continue;
            }
            for(int j=i+1;j<n;j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    arr[j] = -1;
                    break;
                }
            }
            if(count == 0) {
                System.out.print(arr[i]+" ");
            }
            count=0;
        }
    }
}
