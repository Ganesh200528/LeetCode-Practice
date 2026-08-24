class Solution {
    public String clearDigits(String s) {
               Stack<Character>   ss = new Stack<>();
        
        for(int i =0; i < s.length();i++)
        {
            if(s.charAt(i) == '0'||s.charAt(i) == '1'||s.charAt(i) == '2'||s.charAt(i) == '3'||s.charAt(i) == '4'||s.charAt(i) == '5'||s.charAt(i) == '6'||s.charAt(i) == '7'||s.charAt(i) == '8'||s.charAt(i) == '9' )
            {
                ss.pop();
            }
            else
            {
                ss.push(s.charAt(i));
            }
        }
       StringBuilder result = new StringBuilder();

for(char c : ss) {
    result.append(c);
}

return result.toString();
    }
}