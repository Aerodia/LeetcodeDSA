class Solution {
    public int removeElement(int[] nums, int val) {
int k = 0;

        // Loop through the entire array with a "read pointer" 'i'.
        for (int i = 0; i < nums.length; i++) {
            // If the current element is one we want to keep...
            if (nums[i] != val) {
                // ...move it to the front of the array at position 'k'.
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
}}