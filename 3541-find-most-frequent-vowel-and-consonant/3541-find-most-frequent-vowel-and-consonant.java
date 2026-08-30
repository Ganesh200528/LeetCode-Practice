class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> hh = new HashMap<>();
        int maxx =0;
        int maxxx = 0;
        for(char cc : s.toCharArray())
        {
            hh.put(cc,hh.getOrDefault(cc,0)+1);
        }
        for (Map.Entry<Character, Integer> ee: hh.entrySet()) 
        {       
            if(ee.getKey() == 'a' || ee.getKey() == 'e' || ee.getKey() == 'i' || ee.getKey() == 'o' || ee.getKey() == 'u')
            {
                maxx = Math.max(maxx,ee.getValue());
            }
            else
            {
                maxxx = Math.max(maxxx,ee.getValue());
            }
        }
        return (maxxx+maxx);
    }
}