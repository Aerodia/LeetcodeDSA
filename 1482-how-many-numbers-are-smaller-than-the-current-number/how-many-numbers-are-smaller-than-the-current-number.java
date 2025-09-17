class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // Step 1: Create a frequency array.
        // Constraints: 0 <= nums[i] <= 100, so size 101 is needed.
        int[] counts = new int[101];

        // Populate the frequency array.
        for (int num : nums) {
            counts[num]++;
        }

        // Step 2: Calculate the running sum of smaller numbers.
        // After this loop, counts[i] will store how many numbers are smaller than i.
        // We start a loop from 1 since counts[0] will always be 0.
        for (int i = 1; i < 101; i++) {
            counts[i] += counts[i - 1];
        }

        // Step 3: Build the result array using the running sum as a lookup table.
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            // If the number is 0, no numbers are smaller than it.
            if (num == 0) {
                result[i] = 0;
            } else {
                // Otherwise, look up the pre-calculated count at the index *before* it.
                result[i] = counts[num - 1];
            }
        }
        
        return result;
    }
}