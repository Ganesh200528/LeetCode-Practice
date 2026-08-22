class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length*2;
        int[] gg = new int[n];
        for(int i = 0; i < nums.length;i++)
        {
            gg[i] = gg[n-i-1] = nums[i];
        }
        return gg;
    }
}