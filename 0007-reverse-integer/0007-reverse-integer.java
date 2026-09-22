class Solution {
    public int reverse(int x) {
        String gg = String.valueOf(x);
        StringBuilder bb = new StringBuilder();
        for(int i =0;i < gg.length();i++)
        {
            if(gg.charAt(i) != '-')
            {
                bb.append(gg.charAt(i));
            }
        }
        bb.reverse();
        if(x < 0)
        {
            long uu = Long.parseLong(bb.toString());
            if(Integer.MIN_VALUE >  -uu )
            {
                return 0;
            }
            return -(int)uu;
        }
        else
        {
            long uu = Long.parseLong(bb.toString());
            if(Integer.MAX_VALUE < uu)
            {
                return 0;
            }
            return (int)uu;
        }

    }
}