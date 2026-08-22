class Solution {
    public int[] shuffle(int[] nums, int n) 
    {
        int[] gg = new int[nums.length];
        int j = 0;
        int k = n;
        for(int i = 0; i < nums.length;i++)
        {
            gg[i] = nums[j];
            j++;
            i++;
            gg[i] = nums[k];
            k++;
        }
        return gg;
    }
    
}