package paid;// https://leetcode.com/problems/roman-to-integer/

import java.util.*;

public class ERomanInteger {
    public static int romanToInt(String s) {
        if (s=="") {
            return 0;
        }
        int ans=0;
        int[] stor=new int[s.length()];
        for (int i=0; i<stor.length; i++) {
            if (s.charAt(i)=='I') {
                stor[i]=1;
            } else if (s.charAt(i)=='V') {
                stor[i]=5;
            } else if (s.charAt(i)=='X') {
                stor[i]=10;
            } else if (s.charAt(i)=='L') {
                stor[i]=50;
            } else if (s.charAt(i)=='C') {
                stor[i]=100;
            } else if (s.charAt(i)=='D') {
                stor[i]=500;
            } else if (s.charAt(i)=='M') {
                stor[i]=1000;
            }
        }
        for (int i=0; i<stor.length-1; i++) {
            if (stor[i]<stor[i+1]) {
                ans-=stor[i];
            } else {
                ans+=stor[i];
            }
        }
        return ans+stor[stor.length-1];
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
    static int optimal(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);

        int sum = 0;
        int prev = map.get(s.charAt(0));
        int next = 0;

        for (int i = 1; i < s.length(); i++) {
            next = map.get(s.charAt(i));

            if (prev < next) {
                sum -= prev;
            } else {
                sum += prev;
            }

            prev = next;
        }

        sum += prev;
        return sum;
    }
}
