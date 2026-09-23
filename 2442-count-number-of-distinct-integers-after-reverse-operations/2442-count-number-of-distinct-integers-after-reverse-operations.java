class Solution {
    public int countDistinctIntegers(int[] nums) 
    {
        
        HashSet<Integer> hh = new HashSet<>();
        for(int i = 0; i < nums.length;i++)
        {
            StringBuilder ss = new StringBuilder();
            String kk = String.valueOf(nums[i]);
            // if(kk.length() == 1 && kk != "0")
            // {
            //     ss.append('0');
            // }
            ss.append(nums[i]);
            ss.reverse();
            hh.add(Integer.parseInt(ss.toString()));
        }
        for(int i = 0; i < nums.length;i++)
        {
            hh.add(nums[i]);
        }
        return hh.size();
    }
}