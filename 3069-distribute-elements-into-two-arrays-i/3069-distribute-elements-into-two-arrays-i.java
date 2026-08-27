class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> hh = new ArrayList<>();
        ArrayList<Integer> gg = new ArrayList<>();
        if(nums.length > 2)
        {
        hh.add(nums[0]);
        gg.add(nums[1]);

        }
      for(int i = 2; i < nums.length;i++)
      {
            if(hh.get(hh.size()-1) > gg.get(gg.size()-1))
            {
                hh.add(nums[i]);
            }
            else
            {
                gg.add(nums[i]);
            }
      }
      int[] kk = new int[nums.length];
      for(int l = 0; l < kk.length-gg.size();l++)
      {
        kk[l] = hh.get(l);
      }
      int o = 0;
      for(int u = hh.size() ;u < kk.length;u++)
      {
        
        kk[u] = gg.get(o);
        o++;
      }

        return kk;
    }
}