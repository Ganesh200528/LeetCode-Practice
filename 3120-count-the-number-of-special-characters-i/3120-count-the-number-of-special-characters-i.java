class Solution {
    public int numberOfSpecialChars(String word) {
        List<Character> hh = new ArrayList<>();
        int k = 0;
        for(char cc : word.toCharArray())
        {
            if(!hh.contains(cc))
            hh.add(cc);
        }
        for(int i = 0; i < hh.size();i++)
        {
            for(int j = 0;j < hh.size();j++)
            {
                if(hh.get(i) - hh.get(j) == 32)
                {
                    k++;
                }
            }
        }
        return k;
    }
}