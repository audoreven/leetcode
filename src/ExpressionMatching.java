// https://leetcode.com/problems/regular-expression-matching/

public class ExpressionMatching {
    public boolean isMatch(String s, String p) {
        if (p.equals(".*")) {
            return true;
        }
        if (!p.contains("*") && !p.contains(".")) {
            return s.equals(p);
        }
        int q=0;
        for (int i=0; i<s.length(); i++) {
            if (q==p.length()) {
                return false;
            }
            if (s.charAt(i)!=p.charAt(q)) {
                
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
