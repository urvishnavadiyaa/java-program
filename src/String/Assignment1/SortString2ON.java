package String.Assignment1;

public class SortString2ON {
    public static void main(String[] args) {
        String str="dsfjrhjhbd";
        String s="";
        int arr[]=new int[128];
        for (int i = 0; i < str.length(); i++) {
            int ch=str.charAt(i);
            arr[ch]=arr[ch]+1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0) {
              while(arr[i] != 0) {
                  s = s + (char) i;
                  arr[i]-=1;
              }
            }
        }
        System.out.println(s);
    }
}
