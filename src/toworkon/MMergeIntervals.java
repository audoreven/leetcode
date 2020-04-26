package toworkon; // https://leetcode.com/problems/merge-intervals/

import java.util.*;

public class MMergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals.length==0) {
            return intervals;
        }
        ArrayList<int[]> ans = new ArrayList<>();

        int[][] ret=new int[ans.size()][];
        return ans.toArray(ret);
    }

    int[] combine(int[] arr1, int[] arr2) {
        arr1[0]=Math.min(arr1[0], arr2[0]);
        arr1[1]=Math.max(arr1[1], arr2[1]);
        return arr1;
    }
}
