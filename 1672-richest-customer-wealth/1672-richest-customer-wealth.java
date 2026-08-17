class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int temp =0;
        int ans = 0;
        for(int i = 0; i < n;i++)
        {
            for(int j = 0; j <accounts[i].length;j++)
            {
                temp += accounts[i][j];
            }
            ans =Math.max(temp,ans);
            temp = 0;
        }
        return ans;
    }
}