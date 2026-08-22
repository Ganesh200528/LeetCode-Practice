import java.util.*;
class Solution {
    public int digitFrequencyScore(int n) 
    {
        HashMap<Integer,Integer> gg = new HashMap<>();
        int kk = 0;
        String g = String.valueOf(n);
        for(int i = 0; i < g.length();i++)
        {
            int hh = g.charAt(i)- '0';
            gg.put(hh,gg.getOrDefault(hh,0)+1);
        }
        for(Map.Entry<Integer,Integer> jj : gg.entrySet())
         {
            kk += (jj.getKey()*jj.getValue());
        }
        return kk;
        
    }
}