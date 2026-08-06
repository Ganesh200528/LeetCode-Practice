import java.util.*;
class Solution 
{
    public int thirdMax(int[] nums)
    {
        TreeSet<Integer> gan = new TreeSet<>();
        int n = nums.length;
        for(int i = 0 ; i < n;i++)
        {
            gan.add(nums[i]);
        }
        ArrayList<Integer> hh = new ArrayList<>(gan);
        if(hh.size() >= 3)
        {
        return hh.get(hh.size()-3);
        }
        else 
        {
        return hh.get(hh.size()-1);
        }

    }
        
}
