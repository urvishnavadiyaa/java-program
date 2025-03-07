package String.Assignment1;

public class RemoveDupli {
    public static void main(String[] args) {
        String s="helloo";
        int arr[]=new int[128];
        String newstr ="";
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            arr[ch] += 1;
        }
        for (int i = 0; i < s.length(); i++) {
            int c= s.charAt(i);
            if(arr[c] > 0) {
                newstr += (char) c;
                arr[c] = 0;
            }
        }
        System.out.println(newstr);
    }
}
