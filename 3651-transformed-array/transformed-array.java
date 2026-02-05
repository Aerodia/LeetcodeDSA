class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for(int i = 0 ; i <n ; i++){
            int k = nums[i];
            int newIndex = (i + k % n + n) % n;
            result[i] = nums[newIndex];
            
        }
        return result;
    }
}