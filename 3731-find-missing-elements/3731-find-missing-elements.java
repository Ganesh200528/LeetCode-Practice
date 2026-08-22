class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> gg = new ArrayList<>();
        int maxx = Integer.MIN_VALUE;
        int minn = Integer.MAX_VALUE;
        ArrayList<Integer> ll = new ArrayList<>(); 
        for(int i = 0; i < nums.length;i++)
        {
            maxx =Math.max(maxx,nums[i]);
            minn = Math.min(minn,nums[i]);
            gg.add(nums[i]);
        } 
        for(int j = minn; j < maxx;j++)
        {
            if(!gg.contains(j))
            {
                ll.add(j);
            }
        }
        return ll;
    }
}