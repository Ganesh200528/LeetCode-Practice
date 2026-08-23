class Solution {
    public int numberOfBeams(String[] bank) {
        int c = bank.length;
        int r = bank[0].length();
        ArrayList<Integer> gg = new ArrayList<>();
        int  o = 0;
        int kk = 0;
        int temp = 0;
        for(int i = 0; i < c;i++)
        {
            for(int j = 0; j < r;j++)
            {
                    if(bank[i].charAt(j) == '1')
                    {
                        temp ++;
                    }
            }
            if(temp != 0)
            {
             gg.add(temp);
            
            }
            temp = 0;
        }
        for(int k = 0 ; k < gg.size()-1;k++)
        {
            kk += gg.get(k)*gg.get(k+1);
        }
        return kk;
    }
}