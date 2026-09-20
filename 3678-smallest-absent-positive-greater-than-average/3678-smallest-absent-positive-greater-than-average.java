class Solution {
    public int smallestAbsent(int[] nums) {
        HashSet<Integer> aa = new HashSet<>();
        int ans = 0;
        for(int i = 0; i < nums.length;i++)
        {
            aa.add(nums[i]);
            ans += nums[i];
        }
        float kk = ans/nums.length;
        if(kk % 1 == 0)
        {
            int gg = ((int)kk + 1);
            while(aa.contains(gg))
            {
               gg++;
            }
            if(gg <= 0)
            {
                int oo = 1;
                while(aa.contains(oo))
                {
                    oo++;
                }
                return oo;
            }
            return gg;
        }
        else
        {
            int ss = (int)Math.ceil(kk);
            while(aa.contains(ss))
            {
               ss++;
            }
             if(ss <= 0)
            {
                int oo = 1;
               while(aa.contains(oo))
                {
                    oo++;
                }
                return oo;
            }
            return ss;
            
        }

    }
}