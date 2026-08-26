class Solution {
    public String repeatLimitedString(String s, int repeatLimit) 
    {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i = 0; i < s.length();i++)
        {
            char ch = s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }    
        PriorityQueue<freq> pq = new PriorityQueue<>((a,b)-> b.key-a.key);
        for(char ch : hm.keySet())
        {
            pq.add(new freq(ch,hm.get(ch)));
        }

        StringBuilder ans = new StringBuilder();
        while(!pq.isEmpty())
        {
            freq top = pq.poll();
            char ch = top.key;
            int cnt = top.value;
            int cntToBeAdded = Math.min(cnt,repeatLimit);
            for(int i = 0; i < cntToBeAdded;i++)
            {
                ans.append(ch);
            }
            if(cnt > repeatLimit)
            {
                if(pq.isEmpty())
                {
                    break;
                }
                freq top2 = pq.poll();
                char ch2 = top2.key;
                int cnt2 = top2.value;
                ans.append(ch2);
                cnt2--;
                if(cnt2 > 0)
                {
                    pq.add(new freq(ch2,cnt2));
                }
                pq.add(new freq(ch,cnt - repeatLimit));
            }
        }
        return ans.toString();
    }
}


class freq
{
    char key ;
    int value;
    freq(char key,int value)
    {
        this.key = key;
        this.value = value;
    }
}