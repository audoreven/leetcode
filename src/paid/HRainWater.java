package paid; // https://leetcode.com/problems/trapping-rain-water/

// 4/11

import java.util.Arrays;

public class HRainWater {
    public static int trap(int[] height) {
        int n=height.length;
        if (n<3) {
            return 0;
        }
        int ans=0;
        // find max
        int[] dum=height.clone();
        Arrays.sort(dum);
        int max=dum[n-1];
        int p=0; int q=n-1; int h=0;
        while (height[p]!=max && p<q) {
            if (height[p]>h) h=height[p];
            ans+= (h-height[p]);
            p++;
        }
        h=0;
        while (height[q]!=max && q>p) {
            if (height[q]>h) h=height[q];
            ans+= (h-height[q]);
            q--;
        }
        h=max;
        while (p<q) {
            ans+= (h-height[p]);
            p++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] test={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(test));
    }

    /*
    OPTIMAL
    public static int trap(int[] height) {
        int left = 0, right = height.size() - 1;
        int ans = 0;
        int left_max = 0, right_max = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                height[left] >= left_max ? (left_max = height[left]) : ans += (left_max - height[left]);
                left++;
            }
            else {
                height[right] >= right_max ? (right_max = height[right]) : ans += (right_max - height[right]);
                right--;
            }
        }
        return ans;
    }
     */

}
