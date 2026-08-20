class Solution {
    public boolean ispossible(int[] nums,int k)
    {   int temp = k;
        for(int i = 0; i < nums.length;i++)
        {       
            temp = temp + nums[i];
            if(temp < 1)
            {
                return false;
            }

        }
        return true;
    }


    public int minStartValue(int[] nums) {
        int l = 1;
        int r = 10000;
        int ans = 0;
        while(l <= r)
        {
            int mid = l + ( r-l)/2;
            if(ispossible(nums,mid))
            {
                ans = mid;
                r = mid -1;
            }
            else
            {
                l =mid +1;
            }
        }
        return ans;
    }
}