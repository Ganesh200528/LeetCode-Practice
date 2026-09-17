class Solution {
    public int reverseDegree(String s) {
        HashMap<Character,Integer> hh = new HashMap<>();
        int ans = 0;
        String aa = "abcdefghijklmnopqrstuvwxyz";

        for(int i = 0; i < 26;i++)
        {
            hh.put(aa.charAt(i),26-i);
        }
        for(int i = 0; i < s.length();i++)
        {
            ans += hh.get(s.charAt(i))* (i+1);
        }
        return ans;
    }
}