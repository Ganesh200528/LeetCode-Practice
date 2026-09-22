class Solution {
    public boolean areAlmostEqual(String s1, String s2) 
    {
        int ans  = 0;
        ArrayList<Integer> aa = new ArrayList<>();
        StringBuilder sb = new StringBuilder(s2);
        for(int i = 0; i < s1.length();i++)
        {
            if(s1.charAt(i) != s2.charAt(i) && ans <= 4)
            {
                ans++;
                aa.add(i);
                
            }
        }
        if( ans == 0)
        {
            return true;
        }
        else if(ans == 2)
        {
            sb.setCharAt(aa.get(0),s2.charAt(aa.get(1)));
            sb.setCharAt(aa.get(1),s2.charAt(aa.get(0)));
            if(sb.toString().equals(s1))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
       
    }
}