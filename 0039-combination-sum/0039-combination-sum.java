class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        ArrayList<Integer> aa = new ArrayList<>();
        ArrayList<Integer> bb = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < candidates.length; i++) {
            aa.add(candidates[i]);
        }

        find(aa, target, 0, bb, ans);

        return ans;
    }

    public void find(ArrayList<Integer> aa, int target, int index,
                     ArrayList<Integer> bb,
                     List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(bb));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = index; i < aa.size(); i++) {

            bb.add(aa.get(i));

            find(aa, target - aa.get(i), i, bb, ans);

            bb.remove(bb.size() - 1);
        }
    }
}
















// class Solution {
//     public List<List<Integer>> combinationSum(int[] candidates, int target) 
//     {
//         ArrayList<Integer> aa = new ArrayList<>();
//         ArrayList<Integer> bb = new ArrayList<>();
//         List<List<Integer>> ans = new ArrayList<>();
//         for(int i = 0; i < candidates.length;i++)
//         {
//             aa.add(candidates[i]);
//         }
//         aa.add(0);
//         for(int i = 0; i < candidates.length;i++)
//         {
//             if(candidates[i] > target)
//             {
//                 continue;
//             }
//             int xx =  (target/candidates[i]);
//             while(!aa.contains(target - xx*(candidates[i])))
//             {
//                xx--;
//             }
//             int result = xx;
//                 int kk = 0;
//                 while(kk < result)
//                 {
//                     bb.add(candidates[i]);
//                     kk++;
//                 }
//                 if(target - xx*(candidates[i]) != 0)
//                 {
//                 bb.add(target - xx*(candidates[i]));
//                 }

//             if(!bb.isEmpty())
//             {
//             ans.add(new ArrayList<>(bb));
//             bb.clear();
//             }
//         }
//         return ans;
//     }
// }