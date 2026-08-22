class Solution {
    public int[] transformArray(int[] nums) {
        int n = nums.length;
        int[] gg = new int[n];
        int j = 0;
        for(int i = 0; i < n;i++)
        {
            if(nums[i] % 2 == 0)
            {
                gg[j] = 0;
                j++;
            }
        }
        for(int i = 0; i < n;i++)
        {
            if(nums[i] % 2 != 0)
            {
                gg[j] = 1;
                j++;
            }
        }
        return gg;
    }
}