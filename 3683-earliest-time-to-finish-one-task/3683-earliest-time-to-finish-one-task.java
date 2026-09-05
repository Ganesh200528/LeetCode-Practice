class Solution {
    public int earliestTime(int[][] tasks) {
        int minn = 10000;
        int ans = 0;
        for(int i = 0; i < tasks.length;i++)
        {
            for(int j = 0; j < tasks[i].length; j++)
            {
                ans += tasks[i][j];
            }
            minn = Math.min(minn,ans);
            ans = 0;
        }
        return minn;
    }
}