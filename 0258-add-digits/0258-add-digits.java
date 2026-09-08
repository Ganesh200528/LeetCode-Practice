class Solution {
    public int addDigits(int num) {
      String ss = String.valueOf(num);
      int ans = 0;
      if(ss.length() == 1)
      {
        return num;
      }
      while( ss.length() > 1)
      {
        ans = 0;
        for(int i = 0; i < ss.length();i++)
        {
            ans += ss.charAt(i)-'0';
        }  
        if(ans < 10)
        {
            return ans;
        }
        else
        {
            ss = String.valueOf(ans);
        }
      }
      return 1;
    }
}