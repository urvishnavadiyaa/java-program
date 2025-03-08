package String.assingment2;

public class p5 {
    public static void main(String[] args) {
        char c1[]={'5','2','3'};
        char c2[]={'1','6','2'};
        int sum1 =0;
        int sum2 =0;
        for (int i = 0; i < c2.length; i++) {
            sum1 *= 10;
            sum2 *= 10;
            sum1 += c1[i] - '0';
            sum2 += c2[i] - '0';
        }
        System.out.println(sum1+sum2);
    }
}
