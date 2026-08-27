class Solution {
    public int countCharacters(String[] words, String chars) 
    {
        HashMap<Character,Integer> hh = new HashMap<>();
        for(char ch : chars.toCharArray())
        {
            hh.put(ch,hh.getOrDefault(ch,0)+1);
        }
        int l = 0;
        for(String kk : words)
        {
            HashMap<Character,Integer> gg = new HashMap<>();
            Boolean bb = true;
            for(char cc : kk.toCharArray())
            {
                gg.put(cc,gg.getOrDefault(cc,0)+1);

                if(gg.get(cc) > hh.getOrDefault(cc,0))
                {
                    bb = false;
                    break;
                }
            }


                if(bb)
                {
                    l += kk.length();
                }
            
        }
        return l;
    }
}