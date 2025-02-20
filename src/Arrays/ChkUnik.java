package Arrays;

public class ChkUnik {
    public static void main(String[] args) {
        int arr[]={5,2,4,7,9,1,3,4,9,2,4,7};
        int num =7;
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == num) {
                count++;
            }
        }
        if(count == 1) {
            System.out.println("unik");
        }else {
            System.out.println("not unik");
        }
    }
}
