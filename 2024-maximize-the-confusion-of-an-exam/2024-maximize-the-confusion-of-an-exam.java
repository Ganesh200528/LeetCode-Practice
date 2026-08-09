class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int n = answerKey.length();
        int temp = 0;
        int cnt = 0;
        int cnf = 0;
        int l = 0;
        int ans = 0;
        for(int r = 0 ; r < n; r++)
        {
            if(answerKey.charAt(r) == 'T')
            {
                cnt++;
            }
            else
            {
                cnf++;
            }

            while(Math.min(cnt,cnf) > k)
            {
                if(answerKey.charAt(l)== 'T')
                {
                    cnt--;
                }
                else
                {
                    cnf--;
                }
                l++;
            }

            ans = Math.max(ans,r-l+1);
        }
        return ans;
    }
}