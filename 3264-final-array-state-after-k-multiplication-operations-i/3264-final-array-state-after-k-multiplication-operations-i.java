class Solution 
{
    public int[] getFinalState(int[] nums, int k, int multiplier) 
    {
        int minn = Integer.MAX_VALUE;
        int index = 0;
        int i = 0;
        int j = 0;
        while(j < k)
        {
            while(i < nums.length)
            {
                if(nums[i] < minn)
                {
                    minn = nums[i];
                    index = i;
                    
                }
                i++;
            }
        
          int hh = minn*multiplier ;
          nums[index] = hh;
          j++;
          minn = Integer.MAX_VALUE;
          i = 0;

          
        }
        return nums;
    }
}
