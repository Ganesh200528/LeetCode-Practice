class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int temp = 0;
        int[] gg= new int[n];
        for(int i = 0; i < n;i++)
        {
            temp += nums[i];
            gg[i] = temp;
        }
        return gg;
    }
}