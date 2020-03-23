// https://leetcode.com/problems/palindrome-number/

import java.util.*;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x<0) {
            return false;
        }
        ArrayList<Integer> dig=new ArrayList<Integer>();
        while(x!=0) {
            dig.add(x%10);
            x/=10;
        }
        int p=0; int q=dig.size()-1;
        while (p<q) {
            if (dig.get(p)!=dig.get(q)) {
                return false;
            }
            p++; q--;
        }
        return true;
    }
    public static boolean better(int x) {
        if (x<0 || (x!=0 && x%10==0)) {
            return false;
        }
        int rev=0;
        while (rev<x) {
            rev=rev*10+x%10;
            x/=10;
        }
        return rev==x || rev/10==x;
    }

    public static void main(String[] args) {
        int x=10;
        System.out.println(better(x));
    }
}
