import java.util.*;
class Solution {
    public boolean fun(HashMap<Character,Integer> hma, HashMap<Character,Integer> hmb)
    {
        if(hma.size() != hmb.size())
        {
            return false;
        }
        for(char key : hma.keySet())
        {
            if(!hmb.containsKey(key))
            {
                return false;
            }
            int a = hma.get(key);
            int b = hmb.get(key);
            if(a != b)
            {
                return false;
            }
        }

        return true;
    }
    
    
    
    
    
    
    
    public List<Integer> findAnagrams(String s, String p) {
        
        HashMap<Character,Integer> gg = new HashMap<>();
        HashMap<Character,Integer> ff = new HashMap<>();
        
        int n = s.length();
        int k = p.length();
        int l = 0;
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < k;i++)
        {
            char ch = p.charAt(i);
            gg.put(ch,gg.getOrDefault(ch,0)+1);
        }

        for(int r = 0 ; r < n;r++)
        {
            char ch = s.charAt(r);
            ff.put(ch,ff.getOrDefault(ch,0)+1);

            if(r-l == k)
            {
                char cc = s.charAt(l);
                ff.put(cc,ff.get(cc)-1);
                if(ff.get(cc) == 0)
                {
                    ff.remove(cc);
                }
                l++;

            }


            if(r-l+1 == k)
            {
                boolean valid = fun(ff,gg);
                if(valid)
                {
                    ans.add(l);
                }
            }
        }
        return ans;
    }
}