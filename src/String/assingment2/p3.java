package String.assingment2;

public class p3 {
    public static void main(String[] args) {
        String s1="aabc";
        String s2="abac";
        int arr[]=new int[128];
        int arr2[]=new int[128];
        if(s1.length() != s2.length()) {
            System.out.println("false");
            return;
        }
        for (int i = 0; i < s1.length(); i++) {
            int ch1=s1.charAt(i);
            int ch2=s2.charAt(i);
            arr[ch1] += 1;
            arr2[ch2] += 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != arr2[i]) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
