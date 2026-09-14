class Solution {
    public boolean isPalindrome(String s) 
    {
        String aa = "abcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder ss = new StringBuilder();
        for(int i = 0; i < s.length();i++)
        {
            char ch = Character.toLowerCase(s.charAt(i));

            if(aa.indexOf(ch) != -1)
            {
                ss.append(ch);
            }
        }
        String ff = ss.toString();
        int g = 0;
        int j = ff.length()-1;
        while(g < ff.length()/2)
        {
            if(ff.charAt(g) != ff.charAt(j))
            {
                return false;
            }
            g++;
            j--;
        }
        return true;

    }
}