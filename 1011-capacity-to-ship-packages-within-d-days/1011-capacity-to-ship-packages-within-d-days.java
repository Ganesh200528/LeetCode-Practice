class Solution {
    public boolean ispossible(int[] weg,int dys,int k)
    {   int temp = 0;
        for(int i = 0; i < weg.length;i++)
        {   
            int val = weg[i];
            if(val > k)
            {
                return false;
            }
            
            if(temp+val > k)
            {
                dys -= 1;
                temp = 0;
            }
            temp+= val;

            if(dys <= 0)
            {
                return false;
            }
        }
        return true;
    }

    public int shipWithinDays(int[] weights, int days) 
    {
        int l = 1;
        int r = Integer.MAX_VALUE;
        while(l <=r)
        {
        int mid = l + (r - l)/2;
        if(ispossible(weights,days,mid))
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