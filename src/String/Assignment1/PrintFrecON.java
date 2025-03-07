package String.Assignment1;

public class PrintFrecON {
    public static void main(String[] args) {
        String s="dadkmsmalkldmddmdks";
        int arr[]=new int[128];
        for (int i = 0; i < s.length(); i++) {
            int ch=s.charAt(i);
            arr[ch]+=1;
        }
        for (int i = 0; i < arr.length; i++) {
            char ch=(char) i;
            if(arr[i]>0) {
                System.out.println(ch + "->" + arr[i]);
            }
        }
    }
}
