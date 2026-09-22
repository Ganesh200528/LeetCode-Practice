class Solution {
    public int[] rearrangeArray(int[] nums) 
    {
        ArrayList<Integer> aa = new ArrayList<>();
        ArrayList<Integer> bb = new ArrayList<>();
        int[] cc = new int[nums.length];
        for(int i = 0; i < nums.length;i++)
        {
            if(nums[i] < 0)
            {
                aa.add(nums[i]);
            }
            else
            {
                bb.add(nums[i]);
            }
        }
         int kk = 0;
            int ee = 0;
            int uu = 0;
        for(int i = 0; i < nums.length;i++)
        {
           
            if(i%2 == 0)
            {
                cc[kk] = bb.get(ee);
                kk++;
                ee++;
            }
            else
            {
                cc[kk] = aa.get(uu);
                kk++;
                uu++;
            }
        }
        return cc;
    }
}