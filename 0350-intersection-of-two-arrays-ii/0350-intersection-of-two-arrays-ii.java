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
//     public int[] intersect(int[] nums1, int[] nums2) {

//         HashMap<Integer, Integer> hh = new HashMap<>();
//         HashMap<Integer, Integer> kk = new HashMap<>();

//         ArrayList<Integer> qq = new ArrayList<>();

//         // Count nums1
//         for (int i = 0; i < nums1.length; i++) {
//             hh.put(nums1[i], hh.getOrDefault(nums1[i], 0) + 1);
//         }

//         // Count nums2
//         for (int j = 0; j < nums2.length; j++) {
//             kk.put(nums2[j], kk.getOrDefault(nums2[j], 0) + 1);
//         }

//         // Find intersection
//         for (Map.Entry<Integer, Integer> ee : hh.entrySet()) {

//             for (Map.Entry<Integer, Integer> gg : kk.entrySet()) {

//                 if (ee.getKey().equals(gg.getKey())) {

//                     if (ee.getValue() > gg.getValue()) {

//                         for (int aa = 0; aa < gg.getValue(); aa++) {
//                             qq.add(ee.getKey());
//                         }

//                     } else {

//                         for (int aa = 0; aa < ee.getValue(); aa++) {
//                             qq.add(ee.getKey());
//                         }
//                     }
//                 }
//             }
//         }

//         // Create array AFTER qq is filled
//         int[] vv = new int[qq.size()];

//         for (int zz = 0; zz < qq.size(); zz++) {
//             vv[zz] = qq.get(zz);
//         }

//         return vv;
//     }
// }