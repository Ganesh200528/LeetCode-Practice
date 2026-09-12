class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> cc = new HashSet<>();
        for(int i = 0; i < s.length();i++)
        {
            cc.add(s.charAt(i));
        }
        return cc.size();
    }
}