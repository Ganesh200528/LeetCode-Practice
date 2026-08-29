class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] uu = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String aa = "abcdefghijklmnopqrstuvwxyz";
        HashMap<Character,String> hh = new HashMap<>();
        String[] kk = new String[words.length];
        //StringBuilder jj = new StringBuilder();
        HashSet<String> ab = new HashSet<>();
        for(int i = 0; i < uu.length;i++)
        {
            hh.put(aa.charAt(i),hh.getOrDefault(aa.charAt(i),uu[i]));
        }
       StringBuilder ss = new StringBuilder();
       for(int i = 0; i < words.length;i++)
       {
         StringBuilder jj = new StringBuilder();
        for(int j = 0; j < words[i].length();j++)
        {
           jj.append(hh.get(words[i].charAt(j)));

        }
        ab.add(jj.toString());
       }

       return ab.size();
    }
}