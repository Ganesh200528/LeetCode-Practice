class Solution { 
    public int numDifferentIntegers(String word) { 
 
        HashSet<String> hh = new HashSet<>(); 
        ArrayList<Character> aa = new ArrayList<>(); 
 
        for (int i = 0; i <= 9; i++) { 
            aa.add((char)('0' + i)); 
        } 
 
        StringBuilder ss = new StringBuilder(); 
 
        for (int i = 0; i < word.length(); i++) { 
 
            if (aa.contains(word.charAt(i))) { 
                ss.append(word.charAt(i)); 
            }  
            else { 
                if (!ss.isEmpty()) { 
                    while (ss.length() > 1 && ss.charAt(0) == '0') {
                        ss.deleteCharAt(0);
                    }

                    hh.add(ss.toString()); 
                    ss.setLength(0); 
                } 
            } 
        } 
 
        if (!ss.isEmpty()) { 
            while (ss.length() > 1 && ss.charAt(0) == '0') {
                ss.deleteCharAt(0);
            }

            hh.add(ss.toString()); 
        } 
 
        return hh.size(); 
    } 
}






















// class Solution {
//     public int numDifferentIntegers(String word) {
//        HashSet<Integer> hh = new HashSet<>();
//        ArrayList<Character> aa = new ArrayList<>();
       
       
//        for(int i = 0; i <= 9 ;i++)
//        {
//         aa.add((char)('0'+i));
        
//        }
//        StringBuilder ss = new StringBuilder();
//         for(int i = 0; i < word.length();i++)
//         {
            
//             if(aa.contains(word.charAt(i)))
//             {
//                 ss.append(word.charAt(i));
//             }
//             else
//             {
//                 if(!ss.isEmpty())
//                 {
//                 hh.add(Integer.parseInt(ss.toString()));
//                 ss.setLength(0);
//                 }
//             }
//         }
//          if (!ss.isEmpty()) {
//             hh.add(Integer.parseInt(ss.toString()));
//         }

//         return hh.size();
//     }
// }