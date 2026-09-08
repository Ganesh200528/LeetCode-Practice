class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ss = new StringBuilder();
        int minn = 201;
        if(strs.length == 1)
        {
            ss.append(strs[0]);
            return ss.toString();
        }
        for(int k = 0; k < strs.length;k++)
        {
            minn = Math.min(strs[k].length(),minn);
        }
        for(int i = 0; i < minn  ;i++)
        {
            boolean gg = true;
            for(int j = 0; j < strs.length-1 ;j++)
            {
                if(strs[j].charAt(i) != strs[j+1].charAt(i))
                {
                    gg = false;
                    return ss.toString();
                }
            }
            if(gg)
            {
                ss.append(strs[0].charAt(i));
            }
        }
        return ss.toString();
    }
}