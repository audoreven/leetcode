package paid;// https://leetcode.com/problems/integer-to-roman/

// paid 4/25

import java.util.*;

public class MIntegerRoman {

    static Map<Integer, String> map=new HashMap<Integer, String>();

    public static String intToRoman(int num) {
        String ans="";

        map.put(1,"I"); map.put(5,"V"); map.put(10,"X");
        map.put(50,"L"); map.put(100,"C");
        map.put(500,"D"); map.put(1000, "M");
        map.put(4,"IV"); map.put(9, "IX");
        map.put(40,"XL"); map.put(90, "XC");
        map.put(400,"CD"); map.put(900, "CM");

        int[] test={1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int i=0;

        while (num>0) {
            if (num>=test[i]) {
                ans=ans.concat(map.get(test[i]));
                num-=test[i];
            } else {
                i++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(intToRoman(450));

    }

    // opt ??
    /*
    public static String intToRoman(int num) {
        String M[] = {"", "M", "MM", "MMM"};
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
    }
    */
}
