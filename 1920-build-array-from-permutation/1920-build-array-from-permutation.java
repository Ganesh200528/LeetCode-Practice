class Solution {
    public int[] buildArray(int[] nums) {
        int[] gan = new int[nums.length];
        for(int i = 0; i < nums.length;i++)
        {
            
            gan[i] = nums[nums[i]];
        }
        return gan;
    }
}