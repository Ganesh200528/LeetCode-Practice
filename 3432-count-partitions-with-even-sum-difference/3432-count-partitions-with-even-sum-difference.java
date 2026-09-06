class Solution {
    public int countPartitions(int[] nums) 
    {
        int ans = 0;
        int ams = Arrays.stream(nums,0,nums.length).sum();
        int kk = 0;
       for(int i = 0; i < nums.length-1;i++)
        {
            ans += nums[i];
            ams -= nums[i];
            if(Math.abs(ans - ams)%2 == 0)
            {
                kk++;
            }

        }
        return kk;
    }
}