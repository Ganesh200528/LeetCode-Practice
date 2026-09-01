class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        HashMap<Integer, Integer> map = new HashMap<>();

        int rank = 1;

        for (int num : sorted) {
            if (!map.containsKey(num)) {
                map.put(num, rank++);
            }
        }

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = map.get(arr[i]);
        }

        return result;
    }
}



















// class Solution {
//     public int[] arrayRankTransform(int[] arr) {
//         ArrayList<Integer> aa = new ArrayList<>();
//         int[] kk = new int[arr.length];
//        for(int i : arr)
//        {
//          if(!aa.contains(i))
//          {
//             aa.add(i);
//          }
//        }

//        Collections.sort(aa);
//        HashMap<Integer,Integer> hh = new HashMap<>();
//        for(int i =0 ; i < aa.size();i++)
//        {
//         hh.put(aa.get(i),hh.getOrDefault(aa.get(i),i+1));
//        }

        
//         for(int k = 0 ; k < arr.length;k++)
//         {

//             kk[k] = hh.get(arr[k]);
//         }
        
//         return kk;

//     }
// }



