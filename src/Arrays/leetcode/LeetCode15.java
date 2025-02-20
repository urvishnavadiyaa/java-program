package Arrays.leetcode;

public class LeetCode15 {
    public static void main(String[] args) {
        int nums[]={1,2,3,5,6};
        int target=2;
        int i=0,j=nums.length-1;
        while(i <= j) {
            int mid=(i+j)/2;
            if(nums[mid] == target) {
                System.out.println(mid);
                return;
            }
            if(nums[mid] < target) {
                i=mid+1;
            }else {
                j=mid-1;
            }
        }
        System.out.println("not found");
    }
}
