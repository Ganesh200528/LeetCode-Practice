class Solution {
    public String firstPalindrome(String[] words) 
    {
        for(int i = 0; i < words.length;i++)
        {
            int kk = 0;
            int jj = words[i].length()-1;
            while(kk <= jj)
            {
                if(words[i].charAt(kk) != words[i].charAt(jj))
                {
                    break;
                }
                kk++;
                jj--;
                
            }
            if (kk > jj) {
                return words[i];
            }
           
        }
        return "";
    }
}