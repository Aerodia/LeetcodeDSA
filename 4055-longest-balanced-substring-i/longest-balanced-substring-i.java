class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            HashMap<Character, Integer> freq = new HashMap<>();

            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                freq.put(c, freq.getOrDefault(c, 0) + 1);

                if (isBalanced(freq)) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }

    private boolean isBalanced(HashMap<Character, Integer> freq) {
        int f = -1;
        for (int val : freq.values()) {
            if (f == -1) f = val;
            else if (val != f) return false;
        }
        return true;
    }
}
