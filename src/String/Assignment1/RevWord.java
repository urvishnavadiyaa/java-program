package String.Assignment1;

public class RevWord {
    public static void main(String[] args) {
        String s="good morning";
        String ch[] = s.split(" ");
        String newstr = "";
        for (int i = 0; i < ch.length; i++) {
            char str[]=ch[i].toCharArray();
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
        }
        System.out.println(newstr);
    }
}
