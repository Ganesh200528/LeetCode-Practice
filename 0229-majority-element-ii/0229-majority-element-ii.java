class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hh = new HashMap<>();
        ArrayList kk = new ArrayList<>();
        for(int i = 0; i < nums.length;i++)
        {
            hh.put(nums[i],hh.getOrDefault(nums[i],0)+1);
        

            if(hh.get(nums[i]) > (nums.length/3))
            {
                if(!kk.contains(nums[i]))
                {
                    kk.add(nums[i]);
                }
            }
        }
        return kk;
    }
}