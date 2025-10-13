class Solution {
    private int maxOrValue;
    private int subsetCount;

    public int countMaxOrSubsets(int[] nums) {
        this.maxOrValue = 0;
        for (int num : nums) {
            this.maxOrValue |= num;
        }
        this.subsetCount = 0;
        findSubsets(nums, 0, 0);

        return this.subsetCount;
    }
    private void findSubsets(int[] nums, int index, int currentOrValue) {
        if (index == nums.length) {
            if (currentOrValue == this.maxOrValue) {
                this.subsetCount++;
            }
            return;
        }
        findSubsets(nums, index + 1, currentOrValue | nums[index]);
        findSubsets(nums, index + 1, currentOrValue);
    }
}