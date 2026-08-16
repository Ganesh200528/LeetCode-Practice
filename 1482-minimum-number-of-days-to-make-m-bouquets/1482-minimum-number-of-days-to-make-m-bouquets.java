class Solution {
    public static boolean ispossible(int[] gg, int m,int k, int x)
    {
        int look = 0;
        for(int j = 0; j < gg.length;j++)
        {
            if(x >= gg[j])
            {
                look++;
                if(look == k)
            {
                m--;
                look = 0;
            }
            }
            else
            {
                look = 0;
            }

            

            if(m == 0)
            {
                return true;
            }

        }
        return false;
    }



    public int minDays(int[] bloomDay, int m, int k) 
    {
        int temp = (int)Math.pow(10,9);
        int l = 1;
        int r = temp;
        while(l <= r)
        {
            int mid = l + (r - l)/2;
            if(ispossible(bloomDay,m,k,mid))
            {
                r = mid -1;
            }
            else
            {
                l = mid + 1;
            }
        } 
        if(temp+1 == l)
        {
            return -1;
        }
        return l;
    }
}