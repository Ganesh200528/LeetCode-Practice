class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) 
    {   
        
        int n = nums.length;
        int[] gg = new int[n];
        int temp = 0;
       for(int i =0; i < n;i++)
       {
        for(int j = 0; j < n;j++)
        {
            if(nums[j] < nums[i])
            {
                    temp++;
            }

        }
        gg[i] = temp;
        temp = 0;
       }
       return gg;
    }
}