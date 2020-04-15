package paid;// https://leetcode.com/problems/sqrtx/

public class EBadSqrt {
    public static int mySqrt(int x) {
        int low=1; int high =x;
        while (low<high) {
            int mid=(low+high)/2;
            if (mid>x/mid) {
                high=mid;
            } else {
                low=mid+1;
            }
        }
        return (low>1)? low-1: x;
    }
    public static void main(String[] args) {
        System.out.println(mySqrt(2));
    }

    // about as good as it gets w/o leetcode premium
}
