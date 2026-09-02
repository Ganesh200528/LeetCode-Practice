class Solution {
    public String mapWordWeights(String[] words, int[] weights) {

        HashMap<Character,Integer> hh = new HashMap<>();
        int ans = 0;
        StringBuilder xy = new StringBuilder();
        for(int i = 0; i < weights.length;i++)
        {
            char gg = (char)('a'+ i);
            hh.put(gg,hh.getOrDefault(gg,weights[i]));
        }
        for(int i = 0; i < words.length;i++)
        {
            for(int j = 0; j < words[i].length(); j++)
            {
                ans += hh.get(words[i].charAt(j));
            }
             xy.append((char)('z'- (ans % 26))); 
             ans = 0;
        }
        return xy.toString();
    }
}