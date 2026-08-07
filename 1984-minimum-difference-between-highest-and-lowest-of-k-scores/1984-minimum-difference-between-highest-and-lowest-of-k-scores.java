import java.util.*;
class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0; i < n-k+1;i++)
        {
            int j = i+k-1;

            int gg = nums[j]-nums[i];
            ans = Math.min(gg,ans);
        }
        return ans;
        
    }
}