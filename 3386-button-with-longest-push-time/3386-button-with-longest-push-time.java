class Solution {
    public int buttonWithLongestTime(int[][] events) 
    {
        int maxTime = events[0][1];
        int ans = events[0][0];

        for(int i = 1; i < events.length;i++)
        {
            int time = events[i][1] - events[i - 1][1];

            if(time > maxTime || (time == maxTime && events[i][0] < ans))
            {
                maxTime = time;
                ans = events[i][0];
            }
        }
        return ans;
    }
}