package String.Assignment1;

public class FindDupli {
    public static void main(String[] args) {
        String s="navadiyaurvish";
        int arr[]=new int[128];
        for (int i = 0; i < s.length() ; i++) {
            int ch = s.charAt(i);
            arr[ch] += 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 1) {
                System.out.print((char) i + " ");
            }
        }
    }
}
