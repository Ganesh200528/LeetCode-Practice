import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> gg = new HashSet<>();
        int n = nums.length;
        int hel = 0;
        for(int i = 0 ; i < n ; i++)
        {
        if(gg.contains(nums[i]))
        {
            gg.remove(nums[i]);
        }
        else
        {
            gg.add(nums[i]);
        }
        }
       for( int j : gg)
         hel = j;
        return hel;
    }
}

    