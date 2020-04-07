package Review;// https://leetcode.com/problems/longest-palindromic-substring/

public class LongestPalindrome {
    public static void main(String[] args) {
        String s="asdffds";
        if (s.length()>0) {
            // odd
            String ret="";
            String ans="";
            for (int i=0; i<s.length(); i++) {
                int p=i; int q=i;
                ret=s.substring(p, p+1);
                while (p>0 && q<s.length()-1) {
                    p--;
                    q++;
                    if (s.charAt(p)!=s.charAt(q)) {
                        break;
                    } else {
                        ret=s.substring(p, p+1)+ret;
                        ret=ret.concat(s.substring(q, q+1));
                    }
                }
                if (ret.length()>ans.length()) {
                    ans=ret;
                }
            }
            // even
            for (int i=0; i<s.length()-1; i++) {
                int p=i; int q=i+1;
                if (s.charAt(p)==s.charAt(q)) {
                    ret=s.substring(p, p+1).concat(s.substring(q, q+1));
                    while (p > 0 && q < s.length() - 1) {
                        p--;
                        q++;
                        if (s.charAt(p) != s.charAt(q)) {
                            break;
                        } else {
                            ret=s.substring(p, p+1).concat(ret);
                            ret=ret.concat(s.substring(q, q+1));
                        }
                    }
                    if (ret.length()>ans.length()) {
                        ans=ret;
                    }
                }
            }
            System.out.println(ans);
            //return ans;
        } else {
            //return "";
        }
    }
}
