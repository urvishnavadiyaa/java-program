package Metrix;

public class Search1 {
    public static void main(String[] args) {
        int metrix[][]={{12,8,6,2},
                        {9,17,14,8},
                        {5,13,15,16},
                        {4,19,1,5}};
        int m=metrix.length;
        int n=metrix[0].length;

        int left=0;
        int right=n-1;
        int k=13;
        while(right >= 0 && left < m) {
            if(metrix[left][right] == k) {
                System.out.println("present");
                return;
            }
            else if(k > metrix[left][right]) {
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println("not present");
    }
}
