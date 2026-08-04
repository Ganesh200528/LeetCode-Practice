import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        int hee = 0;
        int jee = 0;
        for(int i = 0; i < n-1;i++)
        {
            for(int j = i+1;j < n ;j++)
            {
                if(target - nums[i]== nums[j])
                {
                    hee = i;
                    jee = j;
                    break;
                }
                
            }
            
        }
        int[] arr = {hee,jee};
        return arr;
    }
}