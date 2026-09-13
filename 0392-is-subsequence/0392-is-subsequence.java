class Solution {
    public boolean isSubsequence(String s, String t) {
        int xx = 0;
        for(int i = 0; i < s.length();i++)
        {
            boolean kk = false;
            int j = xx;
            while(j < t.length())
            {

                if(s.charAt(i) == t.charAt(j))
                {
                    kk = true;
                    xx = j+1;
                    break;
                }
                else
                {
                    j++;
                }
            }
            if(!kk)
            {
                return false;
            }
            
        }
        return true;
    }
}