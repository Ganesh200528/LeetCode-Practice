class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int maxx = -1;
        for(int i = 0; i < s.length();i++)
        {
            for(int j = i;j <= s.length()-1;j++)
            {
                if( (s.charAt(i) != s.charAt(j))  || i == j)
                {
                    continue;
                }
                else
                {
                    maxx = Math.max(maxx,Math.abs((j - i)-1));
                }
            }
        }
        return maxx;
    }
}