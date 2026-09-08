class Solution {
    public int balancedStringSplit(String s) {
        int k = 0;
            int kk = 0;
            int gg = 0;
        
        for(int i = 0; i < s.length();i++)
        {
            
            if(s.charAt(i) == 'R')
            {
                k++;
            }
            else
            {
                kk++;
            }
            if(k == kk)
            {
                gg++;
            }
        }
        return gg;
    }
}