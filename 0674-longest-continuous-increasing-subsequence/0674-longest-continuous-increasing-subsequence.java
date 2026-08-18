class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int temp = 1;
        int ans = 0;
        for(int i = 0; i < nums.length-1;i++)
        {
            
            if(nums[i] < nums[i+1])
            {
                temp++;
            }
            else
            {
                ans = Math.max(temp,ans);
                temp = 1;
            }
            
        }
        return Math.max(ans,temp);
    }
}