package paid; // https://leetcode.com/problems/insert-interval/

// paid 4/25

import java.util.*;

public class HInsertIntervals {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> ans =new ArrayList<>();
        boolean add=false;
        for (int i=0; i<intervals.length; i++) {
            // if overlap, combine
            if (intervals[i][0]>newInterval[1] && !add) {
                ans.add(newInterval);
                add=true;
            }
            if ((intervals[i][0]<=newInterval[0] && intervals[i][1]>=newInterval[0])||
                    (intervals[i][0]<=newInterval[1] && intervals[i][1]>=newInterval[1])||
                    (intervals[i][1]<=newInterval[1] && intervals[i][0]>=newInterval[0])||
                    (intervals[i][0]<=newInterval[0] && intervals[i][1]>=newInterval[1])) {
                newInterval=combine(intervals[i], newInterval);
            } else {
                ans.add(intervals[i]);
            }
        }
        if (!add) {
            ans.add(newInterval);
        }
        int[][] ret=new int[ans.size()][];
        return ans.toArray(ret);
    }
    static int[] combine(int[] arr1, int[] arr2) {
        arr1[0]=Math.min(arr1[0], arr2[0]);
        arr1[1]=Math.max(arr1[1], arr2[1]);
        return arr1;
    }

    public static void main(String[] args) {
        //int[][] test={{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[][] test={{1,3}, {6,9}};
        int[] hi={2,5};
        int[][] ans=insert(test, hi);
        for (int i=0; i<ans.length; i++) {
            System.out.println(ans[i][0]+" "+ans[i][1]);
        }
        System.out.println("hi");
    }
    /*
    * if (intervals[intervals.length-1][1]==newInterval[0]) {
            intervals[intervals.length-1][1]=newInterval[1];
            return intervals;
        }

        if (intervals[intervals.length-1][1]<newInterval[0]) {
            for (int[] s: intervals) {
                ans.add(s);
            }
            ans.add(newInterval);
            int[][] ret=new int[ans.size()][];
            return ans.toArray(ret);

        }

        if (intervals[0][0]==newInterval[0]) {
            intervals[0][0]=newInterval[0];
            return intervals;
        }

        if (intervals[0][0]<newInterval[0]) {
            for (int[] s: intervals) {
                ans.add(s);
            }
            ans.add(newInterval);
            int[][] ret=new int[ans.size()][];
            return ans.toArray(ret);

        }

        int[] combine=new int[2];
        int i=0;
        while (intervals[i][1]<=newInterval[0]) {
            ans.add(intervals[i]);
            i++;
        }
        combine[0]=intervals[i][0];
        while (i<intervals.length && intervals[i][1]<=newInterval[1]) {
            i++;
        }
        if (i<intervals.length && newInterval[1]>=intervals[i][0] && newInterval[1]<=intervals[i][1]) {
            combine[1]=intervals[i][1];
            i++;
        } else {
            combine[1] = newInterval[1];
        }

        ans.add(combine);
        while (i<intervals.length) {
            ans.add(intervals[i]);
            i++;
        }*/
}
