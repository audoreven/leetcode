// https://leetcode.com/problems/reverse-integer/

public class ReverseInteger {
    public static void main(String[] args) {
        long ans=0;
        int x=-123;
        if (x/1000000000>0 && x%10>2) {
            System.out.println(0);
        }
        if (x>=0) {
            while (x>0) {
                ans=ans*10+(x%10);
                x/=10;
            }
            if (ans>Integer.MAX_VALUE) {

            }
            System.out.println(ans);
        }
        else {
            x*=-1;
            while (x>0) {
                ans=ans*10+(x%10);
                x/=10;
            }
            System.out.println(-ans);
        }
    }
}
