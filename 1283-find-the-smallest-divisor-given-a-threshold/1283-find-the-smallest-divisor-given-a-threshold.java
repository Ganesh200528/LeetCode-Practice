import java.util.*;
class Solution {
    public int smallestDivisor(int[] nums, int threshold) 
    {
        Arrays.sort(nums);
        int l = 1;
        int r = nums[nums.length-1];
        int ans = r;
        while(l <= r)
        {
            int mid = l + (r -l)/2;
            int temp = 0;

            for(int j : nums)
            {
                
                temp += j/mid;
                if(j % mid != 0)
                {
                    temp++;
                }
            }
                if(temp <= threshold)
                {
                    ans = mid;
                    r = mid-1;
                }
                else
                {
                    l = mid+1;
                }
            
        }
        return ans;

    }
}