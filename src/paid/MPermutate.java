package paid; // https://leetcode.com/problems/permutations/

// 4/18

import java.util.*;

public class MPermutate {
    List<List<Integer>> ans=new ArrayList<List<Integer>>();
    ArrayList<Integer> posi=new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        boolean[] vis=new boolean[nums.length];
        dfs(nums, 0, vis);
        return ans;
    }
    void dfs(int[] nums, int l, boolean[] vis) {
        if (l==nums.length) {
            ArrayList<Integer> add=(ArrayList<Integer>) posi.clone();
            ans.add(add);
            return;
        }
        for (int i=0; i<nums.length; i++) {
            if (!vis[i]) {
                vis[i]=true;
                posi.add(nums[i]);
                dfs(nums, l+1, vis);
                vis[i]=false;
                posi.remove(posi.size()-1);
            }
        }
    }


}
