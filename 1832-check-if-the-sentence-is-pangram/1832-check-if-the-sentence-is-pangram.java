class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> hh = new HashSet<>();
        if(sentence.length() < 26)
        {
            return false;
        }
        for(int i = 0; i < sentence.length();i++)
        {
            hh.add(sentence.charAt(i));
        }
        String aa = "abcdefghijklmnopqrstuvwxyz";
        for(char kk : aa.toCharArray())
        {
            if(!hh.contains(kk))
            {
                return false;
            }
        }
        return true;
    }
}