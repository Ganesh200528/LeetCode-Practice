class Solution {
    public int largestAltitude(int[] gain) 
    {
        int ans = 0;
        int maxx = 0;
        for(int i = 0; i < gain.length;i++)
        {
            maxx =Math.max(ans,maxx);
            ans += gain[i];
            maxx = Math.max(ans,maxx);
        }
        return maxx;
    }
}