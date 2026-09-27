class Solution {
    public boolean checkIfExist(int[] arr) {
      ArrayList<Integer> aa = new ArrayList<>();
      for(int i = 0; i < arr.length;i++)
      {
       
        
        aa.add(arr[i]);
        
      }  
      for(int i = 0; i < arr.length;i++)
      {
        if(aa.contains(arr[i]*2))
        {
            if(aa.indexOf(arr[i]*2) != i)
            {
            return true;
            }
        }
      }
      return false;
    }
}