class Solution {
    public boolean checkDivisibility(int n) {
        String s = String.valueOf(n);
        int sum = 0;
        int mul = 1;
        for(int i = 0 ; i < s.length();i++)
        {
            sum += s.charAt(i)-'0';
            mul *= s.charAt(i)-'0';
        }
        if(n % (sum+mul) == 0)
        {
            return true;
        }
        return false;
    }
}