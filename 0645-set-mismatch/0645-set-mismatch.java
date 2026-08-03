import java.util.*;
class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> gg = new HashSet<>();
        int  yam = 0;
        int hh = 0;
        for(int i = 0 ; i < nums.length;i++)
        {
            if(!gg.contains(nums[i]))
            {
                gg.add(nums[i]);
            }
            else
            {
                yam = nums[i];
            }
        }
        for(int j = 1;j<nums.length+1 ;j++)
        {
            if(!gg.contains(j))
            {
                hh = j;
            }
        }
        int[] ans = {yam,hh};
        return ans;
        
    }
}