package String.Assignment1;

public class RevSrt2 {
    public static void main(String[] args) {
        String str="urvish";
        String str1="";
        for (int i = str.length()-1; i >=0 ; i--) {
            str1+=str.charAt(i);
        }
        System.out.print(str1);
    }
}
