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
        //int temp = (int)Math.pow(10,9);
        if ((long) m * k > bloomDay.length) {
        return -1;
    }
        int maxx = Integer.MIN_VALUE;
        int minn = Integer.MAX_VALUE;
        for(int hh: bloomDay)
        {
            maxx = Math.max(maxx,hh);
            minn = Math.min(minn,hh);
        }
        //int l = 1;
        //int r = temp;
        int l = minn;
        int r = maxx;
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
        
        
        //if(temp+1 == l)
        //{
         //   return -1;
        //}
        return l;
    }
}