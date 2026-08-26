class Solution {
    public String frequencySort(String s) {
        StringBuilder ss = new StringBuilder();
        HashMap<Character,Integer> hh = new HashMap<>();
        for(int i = 0; i < s.length();i++)
        {
            hh.put(s.charAt(i),hh.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Gan> gg = new PriorityQueue<>((a,b) -> b.value - a.value);
        for(Map.Entry<Character,Integer> jj : hh.entrySet())
        {
            gg.add(new Gan(jj.getKey(),jj.getValue()));
        }
        while(!gg.isEmpty())
        {
            Gan temp = gg.poll();
             char   kk   = temp.key;
             int uu = temp.value;
             for(int l = 0; l < uu;l++)
             {
                ss.append(kk);
             }
        }
        return ss.toString();

    }
}

class Gan
{
    char key;
    int value;
    Gan(char key,int value)
    {
        this.key = key;
        this.value = value;
    }
}