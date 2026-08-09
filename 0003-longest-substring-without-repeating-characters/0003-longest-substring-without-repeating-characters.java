import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        
        int l = 0;
        HashSet<Character> gg = new HashSet<>();
        for(int r = 0 ; r < n;r++)
        {
            char ch = s.charAt(r); 
            if(!gg.contains(ch))
            {
                gg.add(ch);
            }
            else
            {
                while(gg.contains(ch))
                {
                    gg.remove(s.charAt(l));
                    l++;
                }
                gg.add(ch);
            }
            ans = Math.max(ans,r-l+1);
        }
        return ans;
    }
}