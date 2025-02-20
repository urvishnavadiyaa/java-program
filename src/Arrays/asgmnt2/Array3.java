package Arrays.asgmnt2;

public class Array3 {
    public static void main(String[] args) {
        int arr[]={1,3,3,7,4,3,2,3,3,2,7,7};
        int n= arr.length;
        int max=0;
        int maxele=0;
        for(int i=0;i<n;i++) {
            int count=0;
            for(int j=0;j<n;j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count > max) {
                maxele = arr[i];
            }
            max=Math.max(max,count);
        }
        System.out.println(maxele);
    }
}