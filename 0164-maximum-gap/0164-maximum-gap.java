class Solution {
    public int maximumGap(int[] nums) 
    {
        if(nums.length == 1)
        {
            return 0;

        }
        Arrays.sort(nums);
        int maxx = 0;
        for(int i = 0; i < nums.length -1;i++)
        {
            int gg = (nums[i+1] - nums[i]);
            if( gg > maxx)
            {
                maxx = gg;
            }
        }
        return maxx;
    }
}