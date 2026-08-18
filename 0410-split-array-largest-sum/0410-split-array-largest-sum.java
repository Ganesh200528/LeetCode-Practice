class Solution {
    public boolean ispossible(int[] nums,int k,int kk)
    {
        int temp = 0;
        k -=  1;
        for(int i = 0; i < nums.length;i++)
        {
            int var = nums[i];
            if (var > kk)
            {
                return false;
            }
            
            if(temp+var > kk)
            {
                k = k-1;
                temp = 0;
            } 
            temp += var;
            if(k < 0 )
            {
            return false;
            }
        }
        return true;
    }
    
    public int splitArray(int[] nums, int k) {
        int l = 0;
        int r = (int)Math.pow(10,9);
        while(l <= r)
        {
            int mid = l+(r-l)/2;
            if(ispossible(nums,k,mid))
            {
               r = mid -1;
            }
            else
            {
                l = mid + 1;
            }
        }
        return l;
    }
}