class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] gg = new int[n];
        int ans = 0;
        for(int i = 0; i < n ;i++)
        {
            gg[i] = heights[i];
        }
        Arrays.sort(gg);
        for(int j = 0 ; j < n;j++)
        {
            if(heights[j] != gg[j])
            {
                ans++;
            }
        }
        return ans;
       


    }
}