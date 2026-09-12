class Solution {
    public String bestHand(int[] ranks, char[] suits) {
       int  maxx = 0;
        boolean kk = true;
        for(int i = 0; i < suits.length -1 ;i++)
        {
            if(suits[i] != suits[i+1])
            {
                kk = false;
                break;
                
            }

        }
        if(kk)
        {
            return "Flush";
        }
        HashMap<Integer,Integer> hh = new HashMap<>();
        for(int i = 0; i < ranks.length;i++)
        {
            hh.put(ranks[i],hh.getOrDefault(ranks[i],0)+1);
        }

       for (Map.Entry<Integer, Integer> k : hh.entrySet()) {
            maxx = Math.max(maxx, k.getValue());
}
         if(maxx >= 3)
            {
                return "Three of a Kind";
            }
            else if(maxx == 2)
            {
                return "Pair";
            }
            else
            {
                return "High Card";
            }

    }
}