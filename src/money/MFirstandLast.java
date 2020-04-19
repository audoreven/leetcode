package money; // https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class MFirstandLast {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;

        if (nums.length==0) {
            return ans;
        }

        boolean streak=false;
        for (int i=0; i<nums.length; i++) {
            if (nums[i]==target && !streak) {
                streak=true;
                ans[0]=i;
            }
            if (streak && nums[i]!=target) {
                ans[1]=i-1;
                return ans;
            }

        }
        if (nums[nums.length-1]==target) {
            ans[1]=nums.length-1;
        }
        return ans;
    }
}
