class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int n = nums.length;
         int temp = 0;
         int zz = 0;
         int cc =0;
        for(int marks = 0; marks  <  1 <<n;marks++)
        {
            for(int i = 0; i < n;i++)
            {
                if((marks & 1 << i) != 0)
                {
                    
                        temp |= nums[i];
                    
                }
            }
            
            for(int hh : nums)
            {
                    cc |= hh;
            }
            if(temp == cc )
            {
                zz ++;
            }
            temp = 0;
            
        }
        return zz;
    }
}