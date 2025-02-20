package Arrays.leetcode;

public class ContainerMostWater {
    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        int i=0;
        int j=arr.length-1;
        int max = 0;
        int min=0;
        int dist=0;
        int total=0;
        while(i < j) {
            min = Math.min(arr[i],arr[j]);
            dist = j-i;
            total=min*dist;
            max = Math.max(max,total);
            if(arr[i] < arr[j]) {
                i++;
            } else {
                j--;
            }
        }
        System.out.println(max);
    }
}
