package paid;// https://leetcode.com/problems/letter-combinations-of-a-phone-number/

// 4/18

import java.util.*;

public class MPhone {


    String[] map = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    List<String> ans = new ArrayList<String>();
    String add="";

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return ans;
        }
        dfs(digits, 0);
        return ans;
    }

    void dfs(String digits, int ind) {
        if (ind==digits.length()) {
            ans.add(add);
            return;
        }
        int n=Integer.parseInt(digits.substring(ind, ind+1));
        for (int j=0; j<map[n].length(); j++) {
            add=add.concat(map[n].substring(j, j+1));
            dfs(digits, ind+1);
            add=add.substring(0, add.length()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("hi");
    }
/*
    public static List<String> opt(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
        if (digits.isEmpty()) return ans;
        String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        for (int i = 0; i < digits.length(); i++) {
            int x = Character.getNumericValue(digits.charAt(i));
            while (ans.peek().length() == i) {
                String t = ans.remove();
                for (char s : mapping[x].toCharArray())
                    ans.add(t + s);
            }
        }
        return ans;
    }

 */
}
