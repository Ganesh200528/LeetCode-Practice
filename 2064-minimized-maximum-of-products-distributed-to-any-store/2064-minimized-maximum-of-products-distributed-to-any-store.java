

class Solution {
    public static boolean ispossible(int[] quan,int n,int k)
    {
        //int temp  =0;
        for(int i = 0; i < quan.length;i++)
        {   
            
           int gg = (quan[i] + k -1)/k;
            n = n-gg;
            
            if(n < 0)
            {
                return false;
            }
        }
        return true;
    }
        public int minimizedMaximum(int n, int[] quantities) 
        {    
            int l = 1;
            int r = (int)Math.pow(10,5);
            while(l <= r)
            {
                int mid = l + (r-l)/2;
                if(ispossible(quantities,n,mid))
                {
                    r = mid -1;
                }
                else
                {
                     l = mid +1;
                }
            }
        return l;
    }
}