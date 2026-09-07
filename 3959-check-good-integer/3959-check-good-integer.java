class Solution {
    public boolean checkGoodInteger(int n) {
        String ss = String.valueOf(n);
        int ans = 0;
        int anss = 0;
        for(char cc : ss.toCharArray())
        {
            int kk = cc-'0';
            ans += kk;
            anss += (kk*kk);

        }
        if((anss-ans) >= 50)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}