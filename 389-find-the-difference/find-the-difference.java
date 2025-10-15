class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> check = new HashMap<>();
        for (char c : t.toCharArray()) {
            check.put(c, check.getOrDefault(c, 0) + 1);
        }
        for (char c : s.toCharArray()) {
            check.put(c, check.get(c) - 1);
        }
        for (Map.Entry<Character, Integer> entry : check.entrySet()) {
            if (entry.getValue() > 0) {
                return entry.getKey();
            }
        }
        return '\0';
    }
}