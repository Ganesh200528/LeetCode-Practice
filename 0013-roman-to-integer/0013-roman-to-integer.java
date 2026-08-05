import java.util.*;
class Solution {
    public int romanToInt(String s)
     {
         HashMap<Character,Integer> he = new HashMap<>();
        he.put('C',100);
        he.put('D',500);
        he.put('V',5);
        he.put('X',10);
        he.put('I',1);
        he.put('L',50);
        he.put('M',1000);
        
        
        int result = he.get(s.charAt(s.length()-1));
        
        for(int i = s.length() -2 ; i >= 0; i--)
        {
            if(he.get(s.charAt(i)) < he.get(s.charAt(i+1)))
            {
                result = result- he.get(s.charAt(i));
            }
            else 
            {
                result = result+he.get(s.charAt(i));
            }
        }
        return result;
    }
}