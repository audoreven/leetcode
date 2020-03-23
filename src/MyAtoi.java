// https://leetcode.com/problems/string-to-integer-atoi/submissions/

import java.math.BigInteger;

public class MyAtoi {
    public static int myAtoi(String str) {
        BigInteger ans = BigInteger.ZERO;
        if (str.length() > 0) {
            int p = 0;
            while (p < str.length() && str.charAt(p) == ' ') {
                p++;
                /*
                if (str.charAt(p) == ' ') {
                    p++;
                } else {
                    break;
                }*/
            }
            if (str.length() == p) {
                return 0;
            }
            if (Character.isDigit(str.charAt(p)) || str.charAt(p) == '-' || str.charAt(p) == '+') {
                int q = p + 1;
                while (q < str.length()) {
                    if (Character.isDigit(str.charAt(q))) {
                        q++;
                    } else {
                        break;
                    }
                }
                if (!str.substring(p, q).equals("-") && !str.substring(p, q).equals("+")) {
                    ans = new BigInteger((str.substring(p, q)));
                } else {
                    ans = BigInteger.ZERO;
                }
                if (ans.compareTo(new BigInteger("2147483647")) >= 0) {
                    return Integer.MAX_VALUE;
                } else if (ans.compareTo(new BigInteger("-2147483648")) <= 0) {
                    return Integer.MIN_VALUE;
                } else {
                    return ans.intValue();
                }
            } else {

                return 0;
            }
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args) {
        String str = " ";
        //System.out.println(myAtoi(str));
        System.out.println(tobedelete(str));

    }

    static int tobedelete(String s) {
        if (s==null || s.equals("")) {
            return 0;
        }
        char[] str=s.toCharArray();
        int sign = 1, base = 0, i = 0;
        while (i < str.length && str[i] == ' ') {
            i++;
        }
        if(i == str.length){
            return 0;
        }

        if (str[i] == '-' || str[i] == '+') {
            sign = 1 - 2 * ((str[i++] == '-')?1:0) ;
        }
        while (i< str.length && str[i] >= '0' && str[i] <= '9') {
            if (base >  Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && str[i] - '0' > 7)) {
                if (sign == 1) return Integer.MAX_VALUE;
                else return Integer.MIN_VALUE;
            }
            base  = 10 * base + (str[i++] - '0');
        }
        return base * sign;
    }
    // optimal (C++)
    /*
    int atoi(const char *str) {
        int sign = 1, base = 0, i = 0;
        while (str[i] == ' ') { i++; }
        if (str[i] == '-' || str[i] == '+') {
            sign = 1 - 2 * (str[i++] == '-');
        }
        while (str[i] >= '0' && str[i] <= '9') {
            if (base >  INT_MAX / 10 || (base == INT_MAX / 10 && str[i] - '0' > 7)) {
                if (sign == 1) return INT_MAX;
                else return INT_MIN;
            }
            base  = 10 * base + (str[i++] - '0');
        }
        return base * sign;
    }
    */
}
