class Solution {
    public boolean equalFrequency(String word) {

        HashMap<Character, Integer> hh = new HashMap<>();

        for (char cc : word.toCharArray()) {
            hh.put(cc, hh.getOrDefault(cc, 0) + 1);
        }

        for (char cc : hh.keySet()) {

            hh.put(cc, hh.get(cc) - 1);

            HashSet<Integer> set = new HashSet<>();

            for (int freq : hh.values()) {
                if (freq > 0) {
                    set.add(freq);
                }
            }

            if (set.size() == 1) {
                return true;
            }

            hh.put(cc, hh.get(cc) + 1);
        }

        return false;
    }
}


















// class Solution {
//     public boolean equalFrequency(String word) 
//     {
//         int ans = 0;
//         int maxx = 0;
//         HashMap<Character,Integer> hh = new HashMap<>();
//         for(char cc: word.toCharArray())
//         {
//             hh.put(cc,hh.getOrDefault(cc,0)+1);
//         }
//         int uu = hh.get(word.charAt(0));
//         for (char cc : hh.keySet()) 
//         {
//             uu = hh.get(cc) - uu;
//             maxx = Math.max(Math.abs(uu),maxx);
//         }

//         if(maxx == 1)
//         {
//             return true;
//         }
//         else
//         {
//             return false;
//         }
//     }
// }