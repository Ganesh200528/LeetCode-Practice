import java.util.*;
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int k = nums.length;
        
        int[] gg = new int[k];
        int j = 0;
        for(int i = 0;i < k;i++)
        {
            if(nums[i] < pivot)
            {
                gg[j] = nums[i];
                j++;
            }
            
        }
        for(int i = 0;i < k;i++)
        {
            if(nums[i] ==  pivot)
            {
                gg[j] = nums[i];
                j++;
            }
            

        }
        for(int i = 0;i < k;i++)
        {
            if(nums[i] > pivot)
            {
                gg[j] = nums[i];
                j++;
            }
            
        }
        return gg;
    }
}