class Solution {
    public int subsetXORSum(int[] nums) {
        return recursionHelper(nums, 0, 0);
    }
    private int recursionHelper(int[] nums, int i, int currentXorSum) {
        if (i == nums.length) {
            return currentXorSum;
        }
        int withElement = recursionHelper(nums, i + 1, currentXorSum ^ nums[i]);
        int withoutElement = recursionHelper(nums, i + 1, currentXorSum);
        return withElement + withoutElement;
    }
}