package String.LeetCode;

public class LeetCode2185 {
    public static Boolean StrContain(String s, String s1) {
        if (s.length() < s1.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s.charAt(i) != s1.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s[]={"kttxeksggb","vucqwew","lyknscc","mryl","vwarnwkfmd","ivawxbntgs","mylw",
                "namybmfy","uosag","rzernqxyn","puf","hfwjnmvm","jjfyd","xteybd","v","ywntwzn","npsogop",
                "brgvlw","vewhi","brk","hheub","zl","vt","bxjtjivep","p","io","xotulskjmt","mctffonh","pmeuqhoe",
                "ghktrtq","u","ngnvwan","pqmlvvhl","enjf","qomcejb","twgqww","bnilyqy","nc","fttlodnz","fya"
                ,"g","uoivsr","gtxgcaf","qs","gkfl","sdmacxf","mzy","xjv","yipc","rctqugjjk","myij","xxg","vyup",
                "utqxplpsa","imbteaczlc","qfgdcz","atfn","pxcsg","f","omukbiaudb","uh","uobwgt","hgqipk",
                "zunfzinenk","i","p","pet","fxai","ortqpwkukg","rxgh","ylfh"};
        String s1= "ikwjoty";
        int count=0;
        for (int i = 0; i < s.length; i++) {
            if (StrContain(s[i],s1)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
