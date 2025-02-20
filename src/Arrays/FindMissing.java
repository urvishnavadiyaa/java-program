package Arrays;

public class FindMissing {
    public static void main(String[] args) {
        int arr[]={1,5,3,4};
        int n=5;
        int sum1=0,sum2=0;
        for(int i=0;i<arr.length;i++) {
            sum2=sum2+(i+1);
            sum1=sum1+arr[i];
        }
        sum2=sum2+n;
        System.out.println(sum2-sum1);
    }
}
