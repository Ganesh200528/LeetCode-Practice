class Solution {
    public int findNumbers(int[] nums) 
    {
      String temp ;
      int gan = 0;
        for(int i = 0 ; i < nums.length;i++)
        {
            temp = String.valueOf(nums[i]);
            if(temp.length() %2 == 0)
            {
                gan++;
            }
        } 
        return gan;  
    }
}