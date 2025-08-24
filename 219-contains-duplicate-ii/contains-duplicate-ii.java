class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            if (seen.containsKey(currentNum)) {
                int prevIndex = seen.get(currentNum);
                if (i - prevIndex <= k) {
                    return true;
                }
            }
            seen.put(currentNum, i);
        }
        return false;
    }
}