package paid; // https://leetcode.com/problems/generate-parentheses/

// 4/18

import java.util.*;

public class MGenParanthesis {
    // I GIVE UP
    static List<String> ans= new ArrayList<String>();

    public static List<String> generateParenthesis(int n) {
        Queue<String> q=new ArrayDeque<>();
        q.add("()");
        while (q.peek().length()<n*2) {
            String a=q.poll();
            if (n%(a.length()/2)==0) {
                String add="";
                for (int i=0; i<((n)/(a.length()/2)); i++) {
                    add=add+a;
                }
                if (!ans.contains(add)) {
                    ans.add(add);
                }
            }
            if (("()"+a).equals(a+"()")){
                q.add("()"+a);
            } else {
                q.add("()"+a);
                q.add(a+"()");
            }
            q.add("("+a+")");
        }

        while (!q.isEmpty()) {
            String a=q.poll();
            if (!ans.contains(a)) {
                ans.add(a);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        generateParenthesis(2);
        System.out.println("end");
    }

    /*
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        if (n == 0) {
            ans.add("");
        } else {
            for (int c = 0; c < n; ++c)
                for (String left: generateParenthesis(c))
                    for (String right: generateParenthesis(n-1-c))
                        ans.add("(" + left + ")" + right);
        }
        return ans;
    }
     */
}
