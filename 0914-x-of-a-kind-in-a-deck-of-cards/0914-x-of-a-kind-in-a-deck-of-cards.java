class Solution {
    public boolean hasGroupsSizeX(int[] deck) {

        HashMap<Integer, Integer> hh = new HashMap<>();

        for (int i = 0; i < deck.length; i++) {
            hh.put(deck[i], hh.getOrDefault(deck[i], 0) + 1);
        }

        int gcd = 0;

        for (int k : hh.keySet()) {
            gcd = findGCD(gcd, hh.get(k));
        }

        return gcd >= 2;
    }

    public int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}


















// class Solution {
//     public boolean hasGroupsSizeX(int[] deck) {
//         HashMap<Integer,Integer> hh = new HashMap<>();
//         for(int i = 0; i < deck.length;i++)
//         {
//             hh.put(deck[i],hh.getOrDefault(deck[i],0)+1);

//         }
        
//         for(int k : hh.keySet())
//         {

//             if( hh.get(k) % 2 != 0)
//             {
//                 return false;
//             }
//         }
//         return true;
//     }
// }