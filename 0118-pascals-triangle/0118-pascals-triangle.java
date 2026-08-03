class Solution {
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> arr = new ArrayList<>();
        
        List<Integer> first = new ArrayList<>();
        first.add(1);
        arr.add(first);
        
        for( int i = 1; i < numRows;i++)
        {
            List<Integer> sec = new ArrayList<>();
            sec.add(1);
            for(int c = 1;c < i ;c++)
            {
                int temp = arr.get(i - 1).get(c) + arr.get(i - 1).get(c - 1);
                sec.add(temp);
            }
            
            sec.add(1);
            
        
        
         arr.add(sec);
        }
     return arr;
    }
    

}