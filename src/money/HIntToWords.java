package money; // https://leetcode.com/problems/integer-to-english-words/



import java.util.*;

public class HIntToWords {
    static Map<Integer, String> map = new HashMap<Integer, String>();

    public static String numberToWords(int num) {
        String ans = "";
        if (map.isEmpty()) {
            put();
        }
        if (num == 0) {
            return "Zero";
        }

        if (num / 1000000000 != 0) {
            ans += numberToWords(num / 1000000000).concat(" Billion ");
            num %= 1000000000;
        }
        if (num / 1000000 != 0) {
            ans += numberToWords(num / 1000000).concat(" Million ");
            num %= 1000000;
        }
        if (num / 1000 != 0) {
            ans += numberToWords(num / 1000).concat(" Thousand ");
            num %= 1000;
        }

        if (num / 100 != 0) {
            ans += numberToWords(num / 100).concat(" Hundred ");
            num %= 100;
        }

        if (num < 100 && num > 0) {
            if (num >= 90) {
                ans = ans.concat("Ninety ");
                num -= 90;
            } else if (num >= 80) {
                ans = ans.concat("Eighty ");
                num -= 80;
            } else if (num >= 70) {
                ans = ans.concat("Seventy ");
                num -= 70;
            } else if (num >= 60) {
                ans = ans.concat("Sixty ");
                num -= 60;
            } else if (num >= 50) {
                ans = ans.concat("Fifty ");
                num -= 50;
            } else if (num >= 40) {
                ans = ans.concat("Forty ");
                num -= 40;
            } else if (num >= 30) {
                ans = ans.concat("Thirty ");
                num -= 30;
            } else if (num >= 20) {
                ans = ans.concat("Twenty ");
                num -= 20;
            } else {
                ans = ans.concat(map.get(num));
                num = 0;
            }

            if (num > 0) {
                ans = ans.concat(map.get(num));
            }
        }

        return ans.substring(0, ans.length() - 1);
    }

    static void put() {
        map.put(1, "One "); map.put(2, "Two "); map.put(3, "Three ");
        map.put(4, "Four "); map.put(5, "Five "); map.put(6, "Six ");
        map.put(7, "Seven "); map.put(8, "Eight "); map.put(9, "Nine ");
        map.put(10, "Ten "); map.put(11, "Eleven "); map.put(12, "Twelve ");
        map.put(13, "Thirteen "); map.put(14, "Fourteen "); map.put(15, "Fifteen ");
        map.put(16, "Sixteen "); map.put(17, "Seventeen "); map.put(18, "Eighteen ");
        map.put(19, "Nineteen ");
    }

    public static void main(String[] args) {
        System.out.println(numberToWords(23456776));
    }

    // opt
    /*
    private final String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};

    public String numberToWords(int num) {
        if (num == 0) return "Zero";

        int i = 0;
        String words = "";

        while (num > 0) {
            if (num % 1000 != 0)
                words = helper(num % 1000) +THOUSANDS[i] + " " + words;
            num /= 1000;
            i++;
        }

        return words.trim();
    }

    private String helper(int num) {
        if (num == 0)
            return "";
        else if (num < 20)
            return LESS_THAN_20[num] + " ";
        else if (num < 100)
            return TENS[num / 10] + " " + helper(num % 10);
        else
            return LESS_THAN_20[num / 100] + " Hundred " + helper(num % 100);
    }
    */
}
