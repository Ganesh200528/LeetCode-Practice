class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> hh = new HashSet<>();
        for(int i =0; i < nums.length;i++)
        {
            hh.add(nums[i]);
        }
        for(int i = 1; i <= nums.length+1;i++)
        {
            int x = k*i;
            if(!hh.contains(x))
            {
                return x;
            }
        }
        return 1;
    }
}