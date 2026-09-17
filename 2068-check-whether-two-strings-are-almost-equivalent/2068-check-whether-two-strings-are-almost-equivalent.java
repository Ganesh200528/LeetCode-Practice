class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) 
    {
        HashMap<Character,Integer> hh = new HashMap<>();
        HashMap<Character,Integer> kk = new HashMap<>();
        for(int i = 0; i < word1.length();i++)
        {
            hh.put(word1.charAt(i),hh.getOrDefault(word1.charAt(i),0)+1);
            kk.put(word2.charAt(i),kk.getOrDefault(word2.charAt(i),0)+1);
        }

        
        for(char cc : hh.keySet())
        {
            if(Math.abs(hh.getOrDefault(cc,0) - kk.getOrDefault(cc,0)) > 3)
               {
                return false;
               }
            
        }
        for(char cc : kk.keySet())
        {
               if(Math.abs(hh.getOrDefault(cc,0) - kk.getOrDefault(cc,0)) > 3)
               {
                return false;
               }
            
        }

        return true;        
    }
}