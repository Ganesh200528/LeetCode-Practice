class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> hh = new LinkedHashMap<>();
        char rr = ' ';
        for(int i = 0; i < s.length();i++)
        {
            hh.put(s.charAt(i),hh.getOrDefault(s.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> gg : hh.entrySet())
        {
            if(gg.getValue() == 1)
            {
               rr =  gg.getKey();
               break;
            }
        }

        for(int u = 0; u < s.length();u++)
        {
            if(s.charAt(u) == rr)
            {
                return u;
            }
        }

        return -1;
    }
}