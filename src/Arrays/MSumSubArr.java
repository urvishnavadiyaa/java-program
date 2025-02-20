package Arrays;

public class MSumSubArr {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,8};
        int maxsum=0,sum=0;
        for(int i=0;i<arr.length;i++) {
            if(sum<0) {
                sum=0;
            }
            sum=sum+arr[i];
            maxsum=Math.max(maxsum,sum);
        }
        System.out.println(maxsum+" ");
    }
}
