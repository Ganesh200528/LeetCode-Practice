class Solution {
    public int prefixCount(String[] words, String pref) {
        int yy = 0;
        for(int i = 0; i < words.length;i++)
        {    
            boolean jj = true; 
            for(int j = 0; j < pref.length(); j++)
            {
                if(words[i].length() < pref.length()||words[i].charAt(j) != pref.charAt(j))
                {
                    jj = false;
                    break;
                }

            }
            if(jj)
            {
                yy++;
            }
        }
        return yy;
    }
}