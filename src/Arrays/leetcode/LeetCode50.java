package Arrays.leetcode;

public class LeetCode50 {
    public static void main(String[] args) {
        double x=3;
        int n=8;
        if(n==0)
            System.out.println("1.0");
        if (x==0)
            System.out.println("0.0");
        if (x==1)
            System.out.println("1.0");
        if (x==-1 && n%2 == 0)
            System.out.println("1.0");
        if (x==-1 && n%2 != 0)
            System.out.println("-1.0");

        long binform = n;
        if (n<0) {
            x=1/x;
            binform=-binform;
        }
        double ans = 1;

        while (binform > 0) {
            if(binform % 2 == 1) {
                ans *= x;
            }
            x*=x;
            binform/=2;
        }
        System.out.println(ans);
    }
}
