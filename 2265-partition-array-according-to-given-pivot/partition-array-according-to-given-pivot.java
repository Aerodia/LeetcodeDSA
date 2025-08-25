class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] answer = new int[n];
        int ansIndex = 0; 
        for (int i = 0; i < n; i++) {
            if (nums[i] < pivot) {
                answer[ansIndex] = nums[i];
                ansIndex++; 
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] == pivot) {
                answer[ansIndex] = nums[i];
                ansIndex++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] > pivot) {
                answer[ansIndex] = nums[i];
                ansIndex++;
            }
        }

        return answer;
    }
}