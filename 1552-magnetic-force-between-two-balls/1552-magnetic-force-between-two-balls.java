
import java.util.*;
class Solution {
    public  boolean ispossible(int[] pos, int m,int k)
    {
        
             int prev = pos[0];
             m -= 1;
            for(int i = 1; i < pos.length;i++)
            {
                int val = pos[i]; 
                while(val - prev >= k)
                {
                    m -=1 ;
                    prev = val;
                }
            
            if( m <= 0)
            {
                return true;
            }
        }
        return false;
    }
    public int maxDistance(int[] position,int m)
    {
        int l = 1;
        int r = (int)Math.pow(10,9);
        Arrays.sort(position);
        while(l <= r)
        {
            int mid = l+(r-l)/2;
            if(ispossible(position,m,mid))
            {
               l = mid + 1;
            }
            else
            {
                r = mid -1;
            }
        }
        return r;

    }
}