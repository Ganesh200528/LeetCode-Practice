import java.util.*;
class Solution 
{
    public int missingNumber(int[] nums) 
    {
         int hx = 0;
        HashSet<Integer> jj = new HashSet<>();
        int n  = nums.length;
        for(int i = 0; i <= n; i++)
        {
           jj.add(i);
        }
        for(int i = 0; i < n; i++)
        {
           jj.remove(nums[i]);
        }
        for(int h : jj)
        {
          hx = h;
          break;
        }
        return hx;
    }    
    
}

