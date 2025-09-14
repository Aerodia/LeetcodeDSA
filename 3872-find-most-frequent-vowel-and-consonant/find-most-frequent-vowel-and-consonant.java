class Solution {
    public int maxFreqSum(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        int maxVowelFreq = 0;
        int maxConsonantFreq = 0;
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            char currentChar = entry.getKey();
            int currentCount = entry.getValue();
            if (vowels.contains(currentChar)) {
                maxVowelFreq = Math.max(maxVowelFreq, currentCount);
            } 
            else {
                maxConsonantFreq = Math.max(maxConsonantFreq, currentCount);
            }
        }
        return maxVowelFreq + maxConsonantFreq;
    }
}