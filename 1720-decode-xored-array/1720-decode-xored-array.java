class Solution {
    public int[] decode(int[] encoded, int first) 
    {
       int n = encoded.length;
       int[] gg = new int[n+1];
       gg[0] = first;
       for(int i = 0; i < n-1;i++)
       { 
        if(i == 0)
        {
          gg[i+1] = first ^ encoded[i];
        }
          gg[i+2] = gg[i+1] ^ encoded[i+1];
        
       }
       if(n == 1)
       {
        gg[1] = first ^ encoded[0]; 
       }
       return gg; 
    }

}