class Solution {
    public int singleNumber(int[] nums) {
        
        HashMap<Integer,Integer> hh = new HashMap<>();
        for(int i = 0; i < nums.length;i++)
        {
            hh.put(nums[i],hh.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> gg : hh.entrySet())
        {

        if(gg.getValue() == 1)
        {
            return gg.getKey();
        }
        }
        return 1;
    }
}