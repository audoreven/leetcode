package paid;// https://leetcode.com/problems/valid-perfect-square/

public class EPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if (num==1 || num ==0) {
            return true;
        }
        int low=1; int high =num;
        while (low<high) {
            int mid=(low+high)/2;
            if (mid>num/mid) {
                high=mid;
            } else {
                low=mid+1;
            }
        }
        return (low-1)*(low-1)==num;
    }

    public static void main(String[] args) {

    }

    // OPTIMAL
    /*
    public boolean isPerfectSquare(int num) {
        int low = 1, high = num;
        while (low <= high) {
            long mid = (low + high) >>> 1;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                low = (int) mid + 1;
            } else {
                high = (int) mid - 1;
            }
        }
        return false;
    }
     */

}
