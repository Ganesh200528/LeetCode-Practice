class Solution {
    public int alternatingSum(int[] nums) {
        int temp =0;
        for(int i =0; i < nums.length;i++)
        {
            if(i % 2 == 0)
            {
                temp += nums[i];
            }
            else
            {
                temp -= nums[i];
            }
        }
        return temp;
        
    }
}