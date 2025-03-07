package String.Assignment1;

public class CountWord2 {
    public static void main(String[] args) {
        String s="hello how are you java";
        int count =1;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch == ' ') {
                count++;
            }
        }
        System.out.println(count);
    }
}
