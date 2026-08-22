import java.util.*;
class Solution {
    public int[] getSneakyNumbers(int[] nums) 
    {
        HashMap<Integer,Integer> gg = new HashMap<>();
        int n = nums.length;
        int[] kk = new int[2];
        int o = 0;
        for(int i = 0; i < n;i++)
        {
            gg.put(nums[i],gg.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> hh : gg.entrySet())
        {
            if(hh.getValue() == 2)
            {
                kk[o] = hh.getKey();
                o++;
            }
        }
        return kk;
    }
}