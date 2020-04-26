package paid; // https://leetcode.com/problems/implement-strstr/

// paid 4/25

public class EstrStr {
    public static int strStr(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }
        int n=needle.length();
        for (int i=0; i<=haystack.length()-n; i++) {
            if (haystack.substring(i, i+n).equals(needle)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("hell", "ll"));
    }
}
