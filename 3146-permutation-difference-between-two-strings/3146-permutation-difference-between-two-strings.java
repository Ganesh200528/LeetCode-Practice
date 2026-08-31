class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character,Integer> hh = new HashMap<>();
        int ans = 0;
        for(int i = 0; i < t.length();i++)
        {
            hh.put(t.charAt(i),hh.getOrDefault(t.charAt(i),i));
        }
        //for(Map.Entry<Character,Integer> gg : hh.entrySet())
        for(int i = 0 ; i < s.length();i++)
        {
            ans += Math.abs(i - hh.get(s.charAt(i)));
        }
        return ans;
    }
}