import java.util.*;
class Solution 
{
    public int minimumCost(int[] cost) 
    {
        int n = cost.length;
        int uu = 0;
        Arrays.sort(cost);
        int hh = 0;
        int kk = n-1;
        int temp = 0;
        while(hh < kk)
        {
                temp = cost[hh];
                cost[hh] = cost[kk];
                cost[kk] = temp;
                hh++;
                kk--;
        }
        for (int i = 0; i < n; i++)
        {
            if (i % 3 != 2) {
            uu += cost[i];
        }
        }
        return uu;
  
    
    }
}