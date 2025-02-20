package Arrays.leetcode;

public class LeetCode6 {
    public static void main(String[] args) {
        int arr[] = {2,25,10,3};
        int sum1=0;
        int sum2=0;
        int temp=0,n=0;
        for(int i=0;i<arr.length;i++) {
            sum1 = sum1 + arr[i];

            temp=arr[i];
            n=temp%10;
            temp=temp/10;

            if(arr[i] % 10 != 0 || n == 0 && temp != 0) {
                int count = 0;
                while(arr[i] != 0) {
                    int j = arr[i] % 10;
                    count=count+j;
                    arr[i] =arr[i]/10;
                }
                sum2 = sum2 + count;
            }
            else {
                sum2 = sum2 + arr[i];
            }
        }
        System.out.println(sum1-sum2);
    }
}
