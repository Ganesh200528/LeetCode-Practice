class Solution {
    public int subsetXORSum(int[] nums) {
         int n = nums.length;
        int temp = 0;
        int xx =0;
        for(int mark = 0; mark < 1<<n;mark++)
        {
            for(int i = 0; i < n;i++)
            {
                if((mark & 1 << i) != 0)
                {
                    temp ^= nums[i];
                }
            }
            xx += temp;
            temp = 0;
        }
        return xx;
    }
}
       