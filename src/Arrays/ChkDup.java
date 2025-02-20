package Arrays;

public class ChkDup {
    public static void main(String[] args) {
        int arr[]={5,2,4,7,9,1,3,4,9,2,4,7};
        int num =5;
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == num) {
                count++;
            }
        }
        if(count > 1) {
            System.out.println("duplicate");
        }else {
            System.out.println("not duplicate");
        }
    }
}
