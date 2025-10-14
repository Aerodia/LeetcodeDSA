class Solution {
    public int findPermutationDifference(String s, String t) {
        Map<Character, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            indexMap.put(t.charAt(i), i);
        }
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int tIndex = indexMap.get(c);
            sum += Math.abs(i - tIndex);
        }
        return sum;
    }
}
