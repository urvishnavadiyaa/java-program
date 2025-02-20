package Arrays.asgmnt1;

public class Array4 {
    public static void main(String[] args) {
        int arr[] = {6,3,5,2,7,6};
        int n = arr.length;
        int d =3;
        int count = 0;
        for(int i=0;i<n;i++) {
            if(arr[i] == d) {
                count++;
            }
        }
        System.out.println(count);
    }
}

