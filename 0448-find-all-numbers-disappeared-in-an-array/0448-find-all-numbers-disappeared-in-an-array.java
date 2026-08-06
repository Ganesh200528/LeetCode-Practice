import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        TreeSet<Integer> gg = new TreeSet<>();
        int n = nums.length;
        ArrayList<Integer> xx = new ArrayList<>();
        for(int i = 0 ;i < n;i++)
        {
            gg.add(nums[i]);
        }
        for(int i = 1 ; i < n+1;i++)
        {
            if(!gg.contains(i))
            {
               xx.add(i); 
            }
        }
        return xx;
        
    
    }
}