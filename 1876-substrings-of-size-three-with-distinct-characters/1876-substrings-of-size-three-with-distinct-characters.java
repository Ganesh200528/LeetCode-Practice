import java.util.*;
class Solution {

    public boolean gann(String h,int k)
    {
        HashSet<Character> gg = new HashSet<>();
        int n = h.length();
        for(int i = 0 ; i < n ; i++)
        {
            gg.add(h.charAt(i));
        }
        if(gg.size() == n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int countGoodSubstrings(String s)
    {
        int k = 3;
        boolean  temp = false;
        int ans = 0;
        int u = s.length();
        for(int j = 0 ; j < u-k+1 ;j++)
        {
            temp = gann(s.substring(j,j+k),k);
            if(temp)
            {
                    ans = ans+1;
            }
        }
        return ans;
    }
}