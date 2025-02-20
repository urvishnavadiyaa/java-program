package Arrays;

public class FindExtra {
    public static void main(String[] args) {
        int arr[]={1,5,3,4,2,4};
        int n=5;
        int sum1=0,sum2=0;
        for(int i=0;i<arr.length;i++) {
            sum2=sum2+i;
            sum1=sum1+arr[i];
        }
        System.out.println(sum1-sum2);
    }
}
