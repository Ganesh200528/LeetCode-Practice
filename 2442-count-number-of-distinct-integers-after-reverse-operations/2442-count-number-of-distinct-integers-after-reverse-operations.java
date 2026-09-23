class Solution {
    public int countDistinctIntegers(int[] nums) 
    {
        
        HashSet<Integer> hh = new HashSet<>();
        for(int i = 0; i < nums.length;i++)
        {
            hh.add(nums[i]);
            StringBuilder ss = new StringBuilder();
            String kk = String.valueOf(nums[i]);
            ss.append(nums[i]);
            ss.reverse();
            hh.add(Integer.parseInt(ss.toString()));
        }
       
        return hh.size();
    }
}