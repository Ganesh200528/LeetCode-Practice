import java.util.*;
class Solution {
    public int countGoodSubstrings(String s) {
        HashMap<Character,Integer> hh = new HashMap<>();
        int ans = 0;
        int l = 0;
        int n = s.length();
        int sl = 3;
        for(int r = 0; r<n;r++)
        {
            char t = s.charAt(r);
            hh.put(t,hh.getOrDefault(t,0)+1);
            if(r -l == sl)
            {
                char tch = s.charAt(l);
                hh.put(tch,hh.get(tch)-1);
                if(hh.get(tch) == 0)
                {
                    hh.remove(tch);
                }
                l++;
            }
                if(hh.size() == 3)
                {
                    ans++;
                }
            
        }
        return ans;
    }
}