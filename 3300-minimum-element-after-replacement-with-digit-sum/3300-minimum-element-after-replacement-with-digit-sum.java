class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        int gg =0;
        int uu = Integer.MAX_VALUE;
        for(int i = 0; i < n;i++)
        {
            String x =String.valueOf(nums[i]);
            for(int j = 0; j < x.length();j++)
            {
                gg += x.charAt(j)-'0';
            }
             uu = Math.min(gg,uu);
             gg = 0;
        }
        return uu;
    }
}