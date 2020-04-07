// https://leetcode.com/problems/first-missing-positive/

import java.util.*;

public class MissPositive {
    public static int firstMissingPositive(int[] nums) {
        int n=nums.length;
        if (n==0) {
            return 1;
        }
        if (n==1) {
            if (nums[0]==1) {
                return 2;
            }
            return 1;
        }
        Arrays.sort(nums);
        if (nums[n-1]<0) {
            return 1;
        }
        int start=0; int ans=0;
        for (int i=0; i<n; i++) {
            if (nums[i]>0) {
                start=i;
                break;
            }
        }
        int[] truenum=new int[n-start];
        for (int i=start; i<n; i++) {
            truenum[i-start]=nums[i];
        }
        n=n-start;
        if (truenum[0]>1) {
            return 1;
        }
        for (int i=1; i<n; i++) {
            if (truenum[i]-truenum[i-1]>1) {
                return (truenum[i-1]<0)? 1:truenum[i-1]+1;
            }
        }
        return truenum[n-1]+1;
    }

    public static void main(String[] args) {
        //int[] nums={11,-6,-4,-7,20,57,57,18,61,41,3,33,30,58,17,46,14,55,-3,-6,23,9,26,-5,27,57,26,44,-4,36,36,17,56,59,20,14,54,31,42,53,11,-1,41,51,11,12,36,51,5,59,56,55,6,36,60,59,31,40,41,37,30,32};
        int[] nums={0,1,2};
        System.out.println(firstMissingPositive(nums));
        System.out.println(opt(nums));
    }
    // opt

    public static int opt(int[] nums) {
        int n=nums.length;
        for(int i = 0; i < n; ++ i) {
            while(nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp=nums[i];
                nums[i]=nums[nums[i]-1];
                nums[temp-1]=temp;
            }
        }

        for(int i = 0; i < n; ++ i) {
            if(nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

}
