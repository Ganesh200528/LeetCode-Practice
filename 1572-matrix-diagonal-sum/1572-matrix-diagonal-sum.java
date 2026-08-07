class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int ans = 0;
        for(int i = 0 ; i < n;i++)
        {
            ans += mat[i][i];
        }
        int g = 0;
        int h = n -1;
        while(g < n)
        {
            ans +=mat[g][h];
            g++;
            h--;
        }
        if(n%2 != 0)
        {
            ans -= mat[n/2][n/2];
        }
        return ans;
    }
}
    