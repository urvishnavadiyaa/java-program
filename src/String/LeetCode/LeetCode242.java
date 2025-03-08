package String.LeetCode;

public class LeetCode242 {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        int arr[]=new int[128];
        int arr2[]=new int[128];

        if(s.length() != t.length()) {
            System.out.println("false");
//            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            int ch=s.charAt(i);
            int ch1=t.charAt(i);
            arr[ch]+=1;
            arr2[ch1]+=1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                if (arr[i] != arr2[i]) {
                    System.out.println("false");
                    return;
//                    return false;
                }
//                if(arr[i] % 2 != 0) {
//                    System.out.println("false");
//                    return;
//                return false;
//                }
            }
        }
        System.out.println("true");
//        return true;
    }
}
