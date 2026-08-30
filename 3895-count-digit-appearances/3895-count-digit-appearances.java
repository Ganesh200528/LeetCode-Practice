class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        
        
       List<Integer> ll = new ArrayList<>();
       int kk = 0;
       for(int i = 0 ; i < nums.length;i++)
       {
            String gg = String.valueOf(nums[i]);
            for(char cc : gg.toCharArray())
            {
                if((cc - '0') == digit)
                {
                    kk++;
                }
            }
       }  
       return kk;
    }
}