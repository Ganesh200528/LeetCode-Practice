class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ig = 0;
        int jj = 0;
        for(int i = 0; i < nums.length;i++)
        {
            if(nums[i] == 1)
            {
                ig++;
                jj = Math.max(ig,jj);
            }
            else
            {
                
                ig = 0;
            }
        }
        return jj;
    }
}