//https://leetcode.com/problems/container-with-most-water/

public class MostWater {
    public static int maxArea(int[] height) {
        int p=0; int q=height.length-1;
        int ans=0;
        while (p<q) {
            ans=Math.max((q-p)*(Math.min(height[p], height[q])),ans);
            if (height[p]<height[q]) {
                p++;
            } else {
                q--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }
}
