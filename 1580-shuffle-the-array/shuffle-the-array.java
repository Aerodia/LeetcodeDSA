class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] answer = new int[2 * n];
        int left = 0;
        int right = n;
        for (int i = 0; i < nums.length; i++) {
            answer[i] = nums[left];
            left++;
            i++;
            answer[i] = nums[right];
            right++;
        }
        return answer;
    }
}