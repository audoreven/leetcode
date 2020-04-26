package paid; // https://leetcode.com/problems/powx-n/

// 4/11

public class MPower {
    public static double myPow(double x, int n) {
        if (n==0) {
            return 1;
        }
        if (n<0) {
            x=1/x;
            n=n*-1;
        }
        return (n%2 == 0) ? myPow(x * x, n/2) : x *  myPow(x * x, n/2);
    }

    public static void main(String[] args) {
        System.out.println(myPow(0.00001,2147483647));
    }

    // OPTIMAL
    /*
    public double myPow(double x, int n) {
        if (n==0) {
            return 1;
        }
        if(n == Integer.MIN_VALUE){
            x *= x;
            n /= 2;
        }
        if (n<0) {
            x = 1/x;
            n *= -1;
        }
        return (n%2 == 0) ? myPow(x * x, n/2) : x *  myPow(x * x, n/2);
    }
     */
}
