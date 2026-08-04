import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> gg = new LinkedHashSet<>();
        int n = nums.length;
        for(int i = 0 ; i < n;i++)
        {
            gg.add(nums[i]);
        }
        int u = 0; 
        for(int gj : gg)
        {
           nums[u] = gj;
           u++; 
        }
        return gg.size();
    }
}