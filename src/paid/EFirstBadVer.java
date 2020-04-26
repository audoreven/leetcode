package paid; //
// 4/18

public class EFirstBadVer {
    boolean isBadVersion(int version){
        if (version>Math.random()) {
            return true;
        }
        return false;
    };
    public int firstBadVersion(int n) {
        int low=1; int high=n;
        while (low<high) {
            int mid=low+(high-low)/2;
            if (isBadVersion(mid)) {
                high=mid;
            } else {
                low=mid+1;
            }
        }
        return high;
    }

}

