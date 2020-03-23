// https://leetcode.com/problems/longest-common-prefix/

import java.util.Arrays;

public class LCPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        Arrays.sort(strs);
        for (int i = 0; i < Math.min(strs[0].length(), strs[strs.length - 1].length()); i++) {
            if (strs[0].charAt(i) != strs[strs.length - 1].charAt(i)) {
                return strs[0].substring(0, i);
            }
        }
        if (strs[0].length() < strs[strs.length - 1].length()) {
            return strs[0];
        }
        return strs[strs.length - 1];
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    // optimal
/*
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        return longestCommonPrefix(strs, 0, strs.length - 1);
    }

    private String longestCommonPrefix(String[] strs, int l, int r) {
        if (l == r) {
            return strs[l];
        } else {
            int mid = (l + r) / 2;
            String lcpLeft = longestCommonPrefix(strs, l, mid);
            String lcpRight = longestCommonPrefix(strs, mid + 1, r);
            return commonPrefix(lcpLeft, lcpRight);
        }
    }

    String commonPrefix(String left, String right) {
        int min = Math.min(left.length(), right.length());
        for (int i = 0; i < min; i++) {
            if (left.charAt(i) != right.charAt(i))
                return left.substring(0, i);
        }
        return left.substring(0, min);
    }
*/
}
