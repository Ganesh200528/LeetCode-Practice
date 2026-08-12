class Solution {

    public int fun(int[] nums, int k)
    {
        if ( k < 0)
            {
                return 0;
            }
    int n = nums.length;
        int temp = 0;
        int l = 0;
        int ans = 0;
        for(int r = 0; r < n;r++)
        {
            
            if(nums[r] == 1)
            {
                temp += 1;
            }

            while( temp > k )
            {
                if(nums[l] == 1)
                {
                    temp --;
                }
                l++;
            }

            ans += r-l+1;
        }
        return ans;
    }
    public int numSubarraysWithSum(int[] nums, int goal) 
    {

        return fun(nums,goal)-fun(nums,goal -1);

    }
     
}