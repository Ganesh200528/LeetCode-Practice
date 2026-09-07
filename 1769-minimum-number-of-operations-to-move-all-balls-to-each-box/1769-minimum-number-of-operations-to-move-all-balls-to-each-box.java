class Solution {
    public int[] minOperations(String boxes) 
    {
        int[] gg = new int[boxes.length()];
        int ans = 0;
          int i = 0;
          while(i < boxes.length())
        {
            for(int j = 0; j < boxes.length();j++)
            {
            if(boxes.charAt(j) == '1')
            {
                ans  += Math.abs(i-j);
            }
            }
            gg[i] = ans;
            i++;
            ans = 0;
        }
        return gg;

    }
}