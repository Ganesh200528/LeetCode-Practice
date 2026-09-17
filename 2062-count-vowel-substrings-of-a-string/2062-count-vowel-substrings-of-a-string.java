class Solution {
    public int countVowelSubstrings(String word) 
    {
        int ans = 0;

        for (int i = 0; i < word.length(); i++) {

            HashSet<Character> hh = new HashSet<>();

            for (int j = i; j < word.length(); j++) {

                char ch = word.charAt(j);

                if (ch != 'a' && ch != 'e' && ch != 'i' &&
                    ch != 'o' && ch != 'u') {
                    break;
                }

                hh.add(ch);

                if (hh.size() == 5) {
                    ans++;
                }
            }
        }
        return ans;
    }
}