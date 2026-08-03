import java.util.*;
class Solution 
{
    public boolean containsDuplicate(int[] nums) 
    {
        HashSet<Integer> rr = new HashSet<>();
        int n = nums.length;
        boolean gg = true;
        for(int i = 0 ; i < n ; i++)
        {
            if(rr.contains(nums[i]))
            {
                return true;
            }
            else
            {
                rr.add(nums[i]);
            }
        }
        return false;   
            
    }
}