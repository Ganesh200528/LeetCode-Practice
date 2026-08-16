class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxx = 0;
        for(int i : piles)
        {
            maxx = Math.max(maxx,i);
        }
        int l = 1;
        int r = maxx;
        int ans = r;

        while(l <=r)
        {
            int mid = l + (r -l)/2;
            long temp = 0;
            for(int j : piles)
            {
                temp += j/mid;
                if(j % mid != 0)
                {
                    temp++;
                }
            }
            if(temp <= h)
            {
                ans = mid;
                r = mid -1;
            }
            else
            {
                l = mid +1;
            }
        }
        return ans;
        
    }
}