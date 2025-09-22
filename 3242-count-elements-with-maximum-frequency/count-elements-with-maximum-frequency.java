class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> num = new HashMap<>();
        for(int n:nums){
            num.put(n,num.getOrDefault(n,0)+1);
        }
        if(num.isEmpty()) return 0;
        int maxFreq = 0;
        for (int n : num.values()) {
            if (n > maxFreq) {
                maxFreq = n;
            }
        }
        int totalFrequency = 0;
        for (int n : num.values()) {
            if (n == maxFreq) {
                totalFrequency += maxFreq;
            }
        }
        return totalFrequency;
    }
}