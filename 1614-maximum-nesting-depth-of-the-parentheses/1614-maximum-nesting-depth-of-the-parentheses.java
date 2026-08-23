class Solution {
    public int maxDepth(String s) {
        
        Stack<Character> ss = new Stack();
        int maxx = Integer.MIN_VALUE;
        for(int i = 0; i < s.length();i++)
        {
            if(s.charAt(i)== '(')
            {
                ss.push('(');
            }
            else if(s.charAt(i) == ')')
            {
                ss.pop();
            }
            maxx = Math.max(maxx,ss.size());
        }
        return maxx;
    }
}