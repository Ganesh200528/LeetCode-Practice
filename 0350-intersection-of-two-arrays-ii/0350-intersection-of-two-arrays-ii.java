import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> hh = new HashMap<>();
        HashMap<Integer, Integer> kk = new HashMap<>();

        ArrayList<Integer> qq = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            hh.put(nums1[i], hh.getOrDefault(nums1[i], 0) + 1);
        }

        for (int j = 0; j < nums2.length; j++) {
            kk.put(nums2[j], kk.getOrDefault(nums2[j], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> ee : hh.entrySet()) {

            if (kk.containsKey(ee.getKey())) {

                int count1 = ee.getValue();
                int count2 = kk.get(ee.getKey());

                int min = Math.min(count1, count2);

                for (int aa = 0; aa < min; aa++) {
                    qq.add(ee.getKey());
                }
            }
        }

        int[] vv = new int[qq.size()];

        for (int zz = 0; zz < qq.size(); zz++) {
            vv[zz] = qq.get(zz);
        }

        return vv;
    }
}





















// import java.util.*;
// class Solution {
//     public int[] intersect(int[] nums1, int[] nums2) 
//     {
//         HashMap<Integer,Integer> hh = new HashMap<>();
//         HashMap<Integer,Integer> kk = new HashMap<>();
//         ArrayList<Integer> qq = new ArrayList<>();
//         // int[] vv = new int[qq.size()];
//         for(int i = 0; i < nums1.length;i++)
//         {
//             hh.put(nums1[i],hh.getOrDefault(nums1[i],0)+1);
//         }
//         for(int j = 0; j < nums2.length;j++)
//         {
//             kk.put(nums2[j],kk.getOrDefault(nums2[j],0)+1);
//         }
        
//         for(Map.Entry<Integer,Integer> ee : hh.entrySet())
//         {
//             for(Map.Entry<Integer,Integer> gg : kk.entrySet())
//             {
//                 if(ee.getKey() == gg.getKey())
//                 {
//                     if(ee.getValue() > gg.getValue())
//                     {
                        
//                         for(int aa = 0; aa < gg.getValue();aa++)
//                         {
//                             qq.add(ee.getKey());
                           
//                         }
//                     }
//                     else
//                     {
//                         for(int aa = 0; aa < ee.getValue();aa++)
//                         {
//                             qq.add(ee.getKey());
                            
//                         }

//                     }
//                 }
//             }
//         }
//         int[] vv = new int[qq.size()];
//         for(int zz = 0; zz < qq.size();zz++)
//         {
//             vv[zz] = qq.get(zz);
//         }
//         return Arrays.sort(vv)
        
//     }
// }







//         HashSet<Integer> gg = new HashSet<>();
//         ArrayList<Integer> hh = new ArrayList<Integer>();
//         for(int i : nums2)
//         {
//             gg.add(i);
//         }
//         for(int j : nums1)
//         {
//             if(gg.contains(j))
//             {
//                 hh.add(j);
//             }
//         }

//         int[] gan = new int[hh.size()];
//         for(int k = 0; k < hh.size();k++)
//         {
//             gan[k] = hh.get(k);
//         }
//         return gan;
//     }
// }