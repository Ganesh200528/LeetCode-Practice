import java.util.*;
class Solution {
    public int arrayPairSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int gv = 0;
        int ans = 0;
        for(int i = 0 ; i < n-1;i =i+2)
        {
            int j = i+1;
  
            ans += Math.min(nums[i],nums[j]);
            
        }
        return ans;
    }
}