class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        boolean[] bb = new boolean[nums.length];
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < nums.length;i++)
        {
            if(bb[i])
            {
                continue;
            }
            ArrayList<Integer> aa = new ArrayList<>();
            for(int j = i; j < nums.length;j++)
            {
                if(!bb[j] && !aa.contains(nums[j]))
                {
                    aa.add(nums[j]);
                    bb[j] = true;
                }
            }
            ans.add(aa);

        }
        return ans;
    }
}