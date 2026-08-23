class Solution {
    public String truncateSentence(String s, int k) {
        String gg = "";
        int temp = 0;
        for(int i = 0; i < s.length();i++)
        {   
            gg += s.charAt(i);
            if(s.charAt(i)== ' ')
            {
                temp++;
                
                if(temp == k)
                {
                    break;
                }

            }
        }
         gg = gg.stripTrailing();
        return gg;
    }
}