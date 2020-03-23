// https://leetcode.com/problems/sum-of-two-integers/

public class SumInteger {
    public static int getSum(int a, int b) {
        int c;
        while(b !=0 ) {
            c = (a&b);
            a = a ^ b;
            b = (c)<<1;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(getSum(1, 2));
    }
}
