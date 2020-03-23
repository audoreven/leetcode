// https://leetcode.com/problems/longest-substring-without-repeating-characters/

import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if (s.length()>0) {
            String longest=s.substring(0,1);
            int ret=0;
            for (int i=2; i<s.length()+1; i++) {
                if (!longest.contains(s.substring(i-1,i))) {
                    longest=longest.concat(s.substring(i-1,i));
                    ret=Math.max(longest.length(), ret);
                } else {
                    // go backwards
                    String b="";
                    for (int j=i; j>0; j--) {
                        if (b.contains(s.substring(j-1, j))) {
                            break;
                        } else {
                            b=b.concat(s.substring(j-1, j));
                        }
                    }
                    ret=Math.max(longest.length(), ret);
                    longest=b;
                }
            }
            System.out.println(ret);
        }
        else {
            System.out.println(0);
        }
    }
    /*
    optimal solution 1
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);Lo
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }*/


    /*
    optimal solution 2
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }
    */
}
