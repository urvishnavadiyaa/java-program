package String.LeetCode;

public class LeetCode1859 {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }

    public static String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] ans=new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            String temp=arr[i];
            int index=temp.charAt(temp.length()-1)-'0'-1;
            ans[index]=arr[i];
        }
        String finalAns="";
        for (int i = 0; i < ans.length; i++) {
            finalAns+=ans[i].substring(0,ans[i].length()-1);
            finalAns+=" ";
        }
        return finalAns.trim();
    }
}
