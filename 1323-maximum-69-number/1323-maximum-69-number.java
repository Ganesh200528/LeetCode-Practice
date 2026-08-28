class Solution {
    public int maximum69Number (int num) {
        String x = String.valueOf(num); 
        //StringBuilder ss = new StringBuilder();  
        String ss = "";
        int k = 1;
        for(int i = 0; i < x.length();i++)
        {
            if(x.charAt(i) == '6' && k < 2)
            {
                ss += '9';
                k++;
                
            }
            else
            {
                ss += (x.charAt(i));
            }
        }
        return Integer.valueOf(ss);

        
    }
}