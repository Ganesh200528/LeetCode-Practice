class Solution {
    public int distinctAverages(int[] nums) {
        HashSet<Float> hh = new HashSet<>();
        Arrays.sort(nums);
        int kk = nums.length-1;
        for(int i = 0; i < nums.length/2;i++)
        {
            hh.add((float)(nums[i]+nums[kk])/2);
            kk--;
        }
        return hh.size();
    }
}