class Solution {

    public boolean ispossible(int[] can,long kk,int k)
    { long temp = 0;
        for(int i = 0; i < can.length;i++)
        {
                temp = can[i]/k;
                kk -= temp;
                temp = 0;
                if(kk <= 0)
                {
                    return true;
                }

        }
        return false;
    }
    public int maximumCandies(int[] candies, long k) 
    {
        int l = 1;
        int r = 1;
        for(int i :candies)
        {
            r = Math.max(r,i);
        }
        while(l <= r)
        {
            int mid = l+(r-l)/2;
            if(ispossible(candies,k,mid))
            {
                l = mid +1;
            }
            else
            {
                r = mid -1;                
                
            }
        }
        return r;
    }
}