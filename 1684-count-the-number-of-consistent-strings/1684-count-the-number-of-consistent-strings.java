class Solution {
    public int countConsistentStrings(String allowed, String[] words) 
    {
        char[] gg = new char[allowed.length()];
        int count = 0;
        for(int i = 0; i < allowed.length();i++)
        {
                gg[i] =allowed.charAt(i);
        }

        for(int j = 0; j < words.length;j++)
        {
            boolean hehe = true;
            for(int h = 0; h < words[j].length();h++)
            {
                char chh =  words[j].charAt(h);
                if(allowed.indexOf(chh) == -1)
                {
                    hehe = false;
                }
            }
            if(hehe)
            {
                count++;
            }
        }
        return count;
    }
}