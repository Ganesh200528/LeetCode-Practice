class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> hh = new HashSet<>();
        for(int i : candyType)
        {
            hh.add(i);
        }
        return Math.min(hh.size(),candyType.length/2);
    }
}