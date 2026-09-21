class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) 
    {
       List<List<Integer>> ans = new ArrayList<>();
       boolean[] used = new boolean[groupSizes.length];

       for(int i = 0; i < groupSizes.length;i++)
       {
        if(used[i])
        {
            continue;
        }
        int size = groupSizes[i];
        List<Integer> group = new ArrayList<>();

        for(int j = i; j < groupSizes.length;j++)
        {
            if(!used[j] && groupSizes[j] == size)
            {
                group.add(j);
                used[j] = true;

                if(group.size() == size)
                {
                    break;
                }
            }
        }
        ans.add(group);
       }
       return ans;
    }
}