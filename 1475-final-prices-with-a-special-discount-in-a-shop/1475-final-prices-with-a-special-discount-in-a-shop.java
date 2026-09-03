class Solution {
    public int[] finalPrices(int[] prices) 
    {
        int[] aa = new int[prices.length];
        int j  =0;
        for(int i = 0; i < prices.length-1;i++)
        {  
             j = i;
            boolean jk = true;
            while(j < prices.length-1)
            {
            
                if(prices[i] >= prices[j+1])
                {
                  
                    aa[i] = prices[i] - prices[j+1];
                    System.out.println(aa[i]);
                    j = i;
                    jk = false;
                    break;
                }
                j++;
                
            }
            if(jk)
            {
                aa[i] = prices[i];
            }
        }
        aa[prices.length-1] = prices[prices.length-1];
        return aa;
    }
}