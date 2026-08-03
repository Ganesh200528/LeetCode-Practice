class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> tt = new HashMap<>();
        HashMap<Character,Character> gg = new HashMap<>();
        int n = s.length();
        boolean ans = true;

        for(int i = 0; i < n;i++)
        {       
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(!tt.containsKey(ch1) && !gg.containsKey(ch2))
            {
                
                tt.put(ch1,ch2);
                gg.put(ch2,ch1);

            }
            else if((tt.containsKey(ch1) && tt.get(ch1) != ch2))
                {
                    ans= false;
                    break;
                }
            else if(gg.containsKey(ch2) && gg.get(ch2) != ch1)
                {
                    ans = false;
                    break;
                }

            }
            return ans;

        }
        
    }
