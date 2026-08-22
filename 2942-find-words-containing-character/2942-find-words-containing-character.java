class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> gg = new ArrayList<>();
        int xx = 0;
        for(int i = 0; i < words.length;i++)
        {
            for(int j = 0; j < words[i].length();j++)
            {
                if(x == words[i].charAt(j))
                {
                    gg.add(i);
                    break;
                }
            }
        }
        return gg;
    }
}