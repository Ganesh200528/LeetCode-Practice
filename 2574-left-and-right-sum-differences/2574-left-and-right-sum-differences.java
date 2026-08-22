class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] gg = new int[n];
        int[] hh = new int[n];
        int temp = 0;
         gg[0] = 0;
        int h = 1;
         hh[n-1] = 0;
         int p = n-2;
        for(int i =0 ; i < n-1 ;i++)
        {
            temp += nums[i];
            gg[h] = temp;
            h++;
        }
        temp = 0;
        for(int j = n-1;j >0;j--)
        {   
            
            temp +=nums[j];
            hh[p] = temp;
            p--;
        } 
       
        int[] kk = new int[n]; 
        for(int j = 0; j < n;j++)
        {
            kk[j] = Math.abs(gg[j] - hh[j]);
        }
        return kk;

    }
}