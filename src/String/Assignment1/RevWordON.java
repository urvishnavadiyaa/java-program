package String.Assignment1;

public class RevWordON {
    public static void main(String[] args) {
        String s="good morning";
        String newstr = "";
        char str[]=s.toCharArray();
        int j=0;
        int k=str.length-1;
        while (j<k) {
            char temp=str[j];
            str[j] = str[k];
            str[k] = temp;
            j++;
            k--;
        }
        newstr += new String(str) + " ";
        String str1="";
        String arr[] = newstr.split(" ");
        for (int i = arr.length-1; i >=0 ; i--) {
            str1 += arr[i] + " ";
        }
        System.out.println(str1);
    }
}
